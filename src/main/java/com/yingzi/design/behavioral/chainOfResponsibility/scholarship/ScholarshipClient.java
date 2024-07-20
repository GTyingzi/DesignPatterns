package com.yingzi.design.behavioral.chainOfResponsibility.scholarship;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yingzi
 * @date 2024/7/20 22:43
 */
public class ScholarshipClient {

    public static void main(String[] args) {
        // 生成学生信息
        List<StudentDto> studentList = new ArrayList<>();
        String[] classNames = {"一班", "二班", "三班"};
        for (int i = 0; i < 100; i++) {
            StudentDto studentDto = new StudentDto("M" + i, "学生" + i, classNames[(int) Math.round(Math.random() * 2)], (int) Math.round(Math.random() * 100));
            System.out.println(studentDto);
            studentList.add(studentDto);
        }
        // 增加两个黑料学生
        studentList.add(new StudentDto("x", "小黑子1号", "一班", 100));
        studentList.add(new StudentDto("y", "小黑子2号", "二班", 99));

        // 生成奖学金审批链
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new CounselorHandler())
                .addHandler(new DepartmentHeadHandler())
                .addHandler(new DeanHandler())
                .addHandler(new PrincipalHandler());

        // 审批奖学金
        List<StudentDto> studentDtos = handlerChain.handleRequest(studentList);
        System.out.println("奖学金审批结果：");
        for (StudentDto studentDto : studentDtos) {
            System.out.println(studentDto);
        }

    }
}
