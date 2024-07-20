package com.yingzi.design.MultiFactory;

import com.yingzi.design.Sender;
import com.yingzi.design.service.MailSender;
import com.yingzi.design.service.SmsSender;

/**
 * @author 郭涛
 * @date 2023/11/21 19:49
 */
public class SendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
