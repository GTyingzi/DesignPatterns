package com.yingzi.Design.MultiFactory;

import com.yingzi.Design.Sender;
import com.yingzi.Design.service.MailSender;
import com.yingzi.Design.service.SmsSender;

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
