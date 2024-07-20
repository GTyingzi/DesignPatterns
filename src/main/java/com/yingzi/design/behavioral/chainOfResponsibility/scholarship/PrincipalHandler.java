package com.yingzi.design.behavioral.chainOfResponsibility.scholarship;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yingzi
 * @date 2024/7/20 23:22
 */
public class PrincipalHandler implements Handler{

    private List<StudentDto> students = new ArrayList<>();

    @Override
    public List<StudentDto> handleRequest(List<StudentDto> studentDto) {

        // 过滤出姓名中包含小黑子的学生
        List<StudentDto> blackStudents = studentDto.stream()
                .filter(studentDTo -> studentDTo.getName().contains("小黑子"))
                .collect(java.util.stream.Collectors.toList());
        for (StudentDto blackStudent : blackStudents) {
            System.out.println(blackStudent.getName() + "，校长拒绝您的奖学金申请! 因为您的名字中包含小黑子。");
        }

        // 剔除blackStudents中的学生
        studentDto.removeAll(blackStudents);
        students.addAll(studentDto);

        for (StudentDto student : students) {
            System.out.println(student.getNumber() + ",恭喜你们通过层层考验，获得了奖学金!");
        }
        return students;
    }
}
