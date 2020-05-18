package com.william.utils;

public class CopyBeanUtils<Dto, Do> {

    /**
     * dot 转换为Do 工具类
     *
     * @param dtoEntity
     * @param doClass
     * @param <Do>
     * @return
     */
    public static <Do> Do dtoToDo(Object dtoEntity, Class<Do> doClass) {
        // 判断dto是否为空!
        if (dtoEntity == null) {
            return null;
        }
        // 判断DoClass 是否为空
        if (doClass == null) {
            return null;
        }
        try {
            Do newInstance = doClass.newInstance();
            org.springframework.beans.BeanUtils.copyProperties(dtoEntity, newInstance);
            // Dto转换Do
            return newInstance;
        } catch (Exception e) {
            return null;
        }
    }
}