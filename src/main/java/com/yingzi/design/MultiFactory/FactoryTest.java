package com.yingzi.design.MultiFactory;

import com.yingzi.design.Sender;

/**
 * @author 郭涛
 * @date 2023/11/21 19:50
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }

}
