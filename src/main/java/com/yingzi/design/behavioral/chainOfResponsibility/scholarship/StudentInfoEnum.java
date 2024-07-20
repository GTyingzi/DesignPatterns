package com.yingzi.design.behavioral.chainOfResponsibility.scholarship;

/**
 * @author yingzi
 * @date 2024/7/20 23:07
 */
public enum StudentInfoEnum {

    CLASS_ONE("一班"),
    CLASS_TWO("二班"),
    CLASS_THREE("三班");

    private final String className;

    StudentInfoEnum(String className) {
        this.className = className;
    }

    public String getName() {
        return className;
    }
}
