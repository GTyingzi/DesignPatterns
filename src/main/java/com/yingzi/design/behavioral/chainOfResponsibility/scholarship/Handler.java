package com.yingzi.design.behavioral.chainOfResponsibility.scholarship;

import java.util.List;

/**
 * @author yingzi
 * @date 2024/7/20 22:42
 */
public interface Handler {

    List<StudentDto> handleRequest(List<StudentDto> studentDto);
}
