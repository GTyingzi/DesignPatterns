package com.yingzi.Design.StaticFactory;

import com.yingzi.Design.Sender;
import com.yingzi.Design.service.MailSender;
import com.yingzi.Design.service.SmsSender;

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
