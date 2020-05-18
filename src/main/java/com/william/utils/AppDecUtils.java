package com.william.utils;


import com.william.constant.RespCodeAndMsg;
import com.william.pojo.Result;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 *   对象解密工具类
 * @author     xinchuang
 * @date       2018/11/28 20:28
 * @version    v1.0
 * @since      @Copyright(c) 爱睿智健康科技(北京)有限公司
 */
public class AppDecUtils {

//    private AppDecUtils() {
//    }
//
//    private static class SingletonInstance {
//        private static final AppDecUtils INSTANCE = new AppDecUtils();
//    }
//
//    public static AppDecUtils getInstance() {
//        return AppDecUtils.SingletonInstance.INSTANCE;
//    }


    /**
     * 解密工具
     * @param  obj
     * @return Object
     * @throws Exception
     */
    public static Object decrypt(Object obj){
        if(Objects.isNull(obj)){
            return Result.getResult(RespCodeAndMsg.UNIFY_EXCEPTION);
        }
        // 获取实体类的所有属性，返回Field数组
        Field[] field = obj.getClass().getDeclaredFields();
        // 遍历所有属性
        for (int j = 0; j < field.length; j++) {
            // 获取属性的名字
            String name = field[j].getName();
            if("SerialVersionUID".equalsIgnoreCase(name)){
                continue;
            }
            // 将属性的首字符大写，方便构造get，set方法
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            // 获取属性的类型
            String type = field[j].getGenericType().toString();
            // 如果type是类类型，则前面包含"class "，后面跟类名
            try {
                Method m = obj.getClass().getMethod("get" + name);
                // 调用getter方法获取属性值
                String value = (String) m.invoke(obj);
                if(StringUtils.isNotBlank(value)){
                // 解密
                value = AESCipher.decrypt(value)==null?value:AESCipher.decrypt(value);
                }
                // 调用setter方法为属性赋值
                Method setMethod= null;
                setMethod = obj.getClass().getMethod("set" + name,String.class);
                setMethod.invoke(obj,value);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return obj;
    }

    /**
     * 解密工具
     * @param  obj
     * @return Object
     * @throws Exception
     */
    public static Object decryptSubClass(Object obj){
        decrypt(obj);
        // 获取父类属性值
        String platform = (String) getFieldValue(obj, "platform");
        String timeStamp = (String) getFieldValue(obj, "timeStamp");
        String versionCode = (String) getFieldValue(obj, "versionCode");
        String deviceId = (String) getFieldValue(obj, "deviceId");
        // 设置属性值
        if(StringUtils.isNotBlank(platform)){
            setFieldValue(obj, "platform", AESCipher.decrypt(platform));
        }
        if(StringUtils.isNotBlank(timeStamp)){
            setFieldValue(obj, "timeStamp", AESCipher.decrypt(timeStamp));
        }
        if(StringUtils.isNotBlank(versionCode)){
            setFieldValue(obj, "versionCode", AESCipher.decrypt(versionCode));
        }
        if(StringUtils.isNotBlank(deviceId)){
            setFieldValue(obj, "deviceId", AESCipher.decrypt(deviceId));
        }
        return obj;
    }


    /**
     * 循环向上转型, 获取对象的 DeclaredMethod
     * @param object : 子类对象
     * @param methodName : 父类中的方法名
     * @param parameterTypes : 父类中的方法参数类型
     * @return 父类中的方法对象
     */

    public static Method getDeclaredMethod(Object object, String methodName, Class<?> ... parameterTypes){
        Method method = null ;

        for(Class<?> clazz = object.getClass() ; clazz != Object.class ; clazz = clazz.getSuperclass()) {
            try {
                method = clazz.getDeclaredMethod(methodName, parameterTypes) ;
                return method ;
            } catch (Exception e) {
                //这里甚么都不要做！并且这里的异常必须这样写，不能抛出去。
                //如果这里的异常打印或者往外抛，则就不会执行clazz = clazz.getSuperclass(),最后就不会进入到父类中了

            }
        }
        return null;
    }

    /**
     * 直接调用对象方法, 而忽略修饰符(private, protected, default)
     * @param object : 子类对象
     * @param methodName : 父类中的方法名
     * @param parameterTypes : 父类中的方法参数类型
     * @param parameters : 父类中的方法参数
     * @return 父类中方法的执行结果
     */

    public static Object invokeMethod(Object object, String methodName, Class<?> [] parameterTypes,
                                      Object [] parameters) {
        //根据 对象、方法名和对应的方法参数 通过反射 调用上面的方法获取 Method 对象
        Method method = getDeclaredMethod(object, methodName, parameterTypes) ;

        //抑制Java对方法进行检查,主要是针对私有方法而言
        method.setAccessible(true) ;

        try {
            if(null != method) {
                //调用object 的 method 所代表的方法，其方法的参数是 parameters
                return method.invoke(object, parameters) ;
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 循环向上转型, 获取对象的 DeclaredField
     * @param object : 子类对象
     * @param fieldName : 父类中的属性名
     * @return 父类中的属性对象
     */
    public static Field getDeclaredField(Object object, String fieldName){
        Field field = null ;

        Class<?> clazz = object.getClass() ;

        for(; clazz != Object.class ; clazz = clazz.getSuperclass()) {
            try {
                field = clazz.getDeclaredField(fieldName) ;
                return field ;
            } catch (Exception e) {
                //这里甚么都不要做！并且这里的异常必须这样写，不能抛出去。
                //如果这里的异常打印或者往外抛，则就不会执行clazz = clazz.getSuperclass(),最后就不会进入到父类中了

            }
        }

        return null;
    }


    /**
     * 直接设置对象属性值, 忽略 private/protected 修饰符, 也不经过 setter
     * @param object : 子类对象
     * @param fieldName : 父类中的属性名
     * @param value : 将要设置的值
     */
    public static void setFieldValue(Object object, String fieldName, Object value){

        //根据 对象和属性名通过反射 调用上面的方法获取 Field对象
        Field field = getDeclaredField(object, fieldName) ;
        //抑制Java对其的检查
        field.setAccessible(true) ;

        try {
            //将 object 中 field 所代表的值 设置为 value
            field.set(object, value) ;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    /**
     * 直接读取对象的属性值, 忽略 private/protected 修饰符, 也不经过 getter
     * @param object : 子类对象
     * @param fieldName : 父类中的属性名
     * @return : 父类中的属性值
     */
    public static Object getFieldValue(Object object, String fieldName){

        //根据 对象和属性名通过反射 调用上面的方法获取 Field对象
        Field field = getDeclaredField(object, fieldName) ;

        //抑制Java对其的检查
        field.setAccessible(true) ;

        try {
            //获取 object 中 field 所代表的属性值
            return field.get(object) ;

        } catch(Exception e) {
            e.printStackTrace() ;
        }
        return null;
    }

}
