package com.le.framework.utils;

public class StringUtils {
    private StringUtils() {
    }

    public static String getSetterMethodNameByFieldName(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
}
