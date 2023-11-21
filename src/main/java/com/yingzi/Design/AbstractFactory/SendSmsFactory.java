package com.yingzi.Design.AbstractFactory;

import com.yingzi.Design.Provider;
import com.yingzi.Design.Sender;
import com.yingzi.Design.service.SmsSender;

/**
 * @author 郭涛
 * @date 2023/11/21 19:59
 */
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
