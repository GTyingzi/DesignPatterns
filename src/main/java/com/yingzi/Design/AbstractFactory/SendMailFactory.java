package com.yingzi.Design.AbstractFactory;

import com.yingzi.Design.Provider;
import com.yingzi.Design.Sender;
import com.yingzi.Design.service.MailSender;

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
