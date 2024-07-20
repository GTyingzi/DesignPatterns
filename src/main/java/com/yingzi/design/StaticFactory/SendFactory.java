package com.yingzi.design.StaticFactory;

import com.yingzi.design.Sender;
import com.yingzi.design.service.MailSender;
import com.yingzi.design.service.SmsSender;

/**
 * @author 郭涛
 * @date 2023/11/21 18:34
 */
public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
