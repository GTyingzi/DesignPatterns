package com.yingzi.design.AbstractFactory;

import com.yingzi.design.Provider;
import com.yingzi.design.Sender;

/**
 * @author 郭涛
 * @date 2023/11/21 20:00
 */
public class FactoryTest {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }

}
