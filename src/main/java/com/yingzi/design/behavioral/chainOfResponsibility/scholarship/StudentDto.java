package com.yingzi.design.behavioral.chainOfResponsibility.scholarship;

/**
 * @author yingzi
 * @date 2024/7/20 22:47
 */
public class StudentDto {

    /**
     * 学生学号
     */
    private String number;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生班级
     */
    private String className;
    /**
     * 学生成绩
     */
    private Integer score;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public StudentDto(String number, String name, String className, Integer score) {
        this.number = number;
        this.name = name;
        this.className = className;
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", score=" + score +
                '}';
    }
}
