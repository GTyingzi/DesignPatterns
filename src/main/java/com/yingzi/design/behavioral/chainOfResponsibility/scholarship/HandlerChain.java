package com.yingzi.design.behavioral.chainOfResponsibility.scholarship;


import java.util.ArrayList;
import java.util.List;

/**
 * @author yingzi
 * @date 2024/7/20 22:42
 */
public class HandlerChain implements Handler {

    private List<Handler> handlerList;
    private List<StudentDto> students = new ArrayList<>();


    public HandlerChain() {
        handlerList = new ArrayList<>();
    }

    public HandlerChain addHandler(Handler handler) {
        handlerList.add(handler);
        return this;
    }

    @Override
    public List<StudentDto> handleRequest(List<StudentDto> studentDtos) {
        for (Handler handler : handlerList) {
            if (students.isEmpty()) {
                students = handler.handleRequest(studentDtos);
            } else {
                students = handler.handleRequest(students);
            }
        }
        return students;
    }

}
