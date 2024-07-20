package com.yingzi.design.behavioral.chainOfResponsibility.scholarship;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yingzi
 * @date 2024/7/20 22:51
 */
public class CounselorHandler implements Handler{
    private List<StudentDto> students = new ArrayList<>();

    @Override
    public List<StudentDto> handleRequest(List<StudentDto> studentDtos) {
        for (StudentDto studentDto : studentDtos) {
            if (studentDto.getScore() > 60) {
                System.out.println(studentDto.getName() + "，辅导员已经同意您的奖学金申请! 因为您的成绩是" + studentDto.getScore() + "分。");
                students.add(studentDto);
            } else {
                System.out.println(studentDto.getName() + "，辅导员拒绝您的奖学金申请! 因为您的成绩是" + studentDto.getScore() + "分。");
            }
        }
        return students;
    }

}
