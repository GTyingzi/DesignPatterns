package com.yingzi.design.StaticFactory;

import com.yingzi.design.Sender;

/**
 * @author 郭涛
 * @date 2023/11/21 19:51
 */
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }

}
