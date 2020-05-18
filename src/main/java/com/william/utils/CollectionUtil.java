package com.william.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionUtil {

    public static List<Integer> stringToIntegerList(String str, String segmentation) {
        return str == null ? null : stringArrayToIntegerList(str.split(segmentation));
    }

    public static List<Integer> stringArrayToIntegerList(String[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();
        for (String str : array) {
            list.add(Integer.parseInt(str));
        }
        return list;
    }

    public static List<String> stringToList(String str, String segmentation) {
        return str == null ? null : stringArrayToList(str.split(segmentation));
    }

    public static List<String> stringArrayToList(String[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        List<String> list = new ArrayList<String>();
        for (String str : array) {
            list.add(str);
        }
        return list;
    }

    public static String integerListToString(List<Integer> list, String segmentation) {
        if (isEmpty(list)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : list) {
            sb.append(segmentation);
            sb.append(i);
        }

        return sb.substring(segmentation.length());
    }

    private static boolean isEmpty(Collection<?> coll) {
        return (coll == null || coll.isEmpty());
    }
    
    /**
     * 将字符串集合 转换为通过标识符间隔的字符串
     * @author AlexGeng
     * @日期 2015-12-18
     * @param list
     * @param sep 标识符
     * @return
     */
    public static String listToString(List<String> list, String sep)
    {
    	if (list==null) {
            return null;
        }
        StringBuilder result=new StringBuilder();
        boolean flag=false;
        for (String string : list) {
            if (flag) {
            	result.append(sep);
            }else {
                flag=true;
            }           
            result.append(string);            
        }
        return result.toString();
    }
    
    
    /**
     * 将字符串集合 转换为通过标识符间隔的sql in使用的字符串
     * @author AlexGeng
     * @日期 2015-12-18
     * @param list
     * @param sep 标识符
     * @return
     */
    public static String listToSqlString(List<String> list, String sep)
    {
    	if (list==null) {
            return null;
        }
        StringBuilder result=new StringBuilder();
        boolean flag=false;
        for (String string : list) {
            if (flag) {
            	result.append(sep);
            }else {
                flag=true;
            }
            result.append("'");
            result.append(string);   
            result.append("'");
        }
        return result.toString();
    }
    

}
