package com.yingzi.design.behavioral.chainOfResponsibility.oa;

/**
 * @author yingzi
 * @date 2024/7/20 21:44
 */
public interface Handler {

   void handleRequest(String name, int days);

   boolean isRequestHandled();
}
