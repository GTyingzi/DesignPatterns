package com.yingzi.design.behavioral.chainOfResponsibility.scholarship;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author yingzi
 * @date 2024/7/20 22:52
 */
public class DepartmentHeadHandler implements Handler{

    private List<StudentDto> students = new ArrayList<>();

    @Override
    public List<StudentDto> handleRequest(List<StudentDto> studentDtos) {
        for (StudentDto studentDto : studentDtos) {
            if (Objects.equals(StudentInfoEnum.CLASS_ONE.getName(), studentDto.getClassName()) || Objects.equals(StudentInfoEnum.CLASS_TWO.getName(), studentDto.getClassName())){
                System.out.println(studentDto.getName() + "，系主任已经同意您的奖学金申请! 因为您是一班或二班的学生");
                students.add(studentDto);
            } else {
                System.out.println(studentDto.getName() + "，系主任不同意您的奖学金申请! 因为您不是一班或二班的学生");
            }
        }

        return students;
    }

}
