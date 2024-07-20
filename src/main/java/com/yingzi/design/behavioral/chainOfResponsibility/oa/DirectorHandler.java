package com.yingzi.design.behavioral.chainOfResponsibility.oa;

/**
 * @author yingzi
 * @date 2024/7/20 21:48
 */
public class DirectorHandler implements Handler {

    private boolean isHandled = false;

    @Override
    public void handleRequest(String name, int days) {
        if (days <= 7) {
            System.out.println(name + "，主管已经同意您的请假审批!");
            isHandled = true;
        }
    }

    @Override
    public boolean isRequestHandled() {
        return isHandled;
    }
}
