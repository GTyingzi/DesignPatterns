package com.yingzi.design.NormalFactory;

import com.yingzi.design.Sender;

/**
 * @author 郭涛
 * @date 2023/11/21 19:45
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }

}
