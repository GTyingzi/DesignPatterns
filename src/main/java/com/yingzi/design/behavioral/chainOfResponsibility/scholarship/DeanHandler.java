package com.yingzi.design.behavioral.chainOfResponsibility.scholarship;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.yingzi.design.behavioral.chainOfResponsibility.scholarship.StudentInfoEnum.CLASS_ONE;
import static com.yingzi.design.behavioral.chainOfResponsibility.scholarship.StudentInfoEnum.CLASS_TWO;

/**
 * @author yingzi
 * @date 2024/7/20 22:53
 */
public class DeanHandler implements Handler{

    private List<StudentDto> students = new ArrayList<>();

    @Override
    public List<StudentDto> handleRequest(List<StudentDto> studentDtos) {

        // 得到一班的学生，成绩在前4名
        List<StudentDto> classOneStudents = studentDtos.stream()
                .filter(studentDTo -> CLASS_ONE.getName().equals(studentDTo.getClassName()))
                .sorted(Comparator.comparing(StudentDto::getScore).reversed())
                .limit(4)
                .collect(Collectors.toList());
        // 得到二班的学生，成绩在前5名
        List<StudentDto> classTwoStudents = studentDtos.stream()
                .filter(studentDTo -> CLASS_TWO.getName().equals(studentDTo.getClassName()))
                .sorted(Comparator.comparing(StudentDto::getScore).reversed())
                .limit(5)
                .collect(Collectors.toList());

        for (StudentDto classOneStudent : classOneStudents) {
            System.out.println(classOneStudent.getName() + "，院长已经同意您的奖学金申请! 因为您是一班的学生，成绩在前4名");
        }
        for (StudentDto classTwoStudent : classTwoStudents) {
            System.out.println(classTwoStudent.getName() + "，院长已经同意您的奖学金申请! 因为您是二班的学生，成绩在前5名");
        }

        students.addAll(classOneStudents);
        students.addAll(classTwoStudents);
        return students;
    }

}
