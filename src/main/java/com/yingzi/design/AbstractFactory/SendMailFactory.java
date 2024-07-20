package com.yingzi.design.AbstractFactory;

import com.yingzi.design.Provider;
import com.yingzi.design.Sender;
import com.yingzi.design.service.MailSender;

/**
 * @author 郭涛
 * @date 2023/11/21 19:58
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
