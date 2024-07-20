package com.yingzi.design.service;

import com.yingzi.design.Sender;

/**
 * @author 郭涛
 * @date 2023/11/21 18:36
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
