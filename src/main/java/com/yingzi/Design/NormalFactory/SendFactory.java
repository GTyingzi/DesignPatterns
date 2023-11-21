package com.yingzi.Design.NormalFactory;

import com.yingzi.Design.Sender;
import com.yingzi.Design.service.MailSender;
import com.yingzi.Design.service.SmsSender;

/**
 * @author 郭涛
 * @date 2023/11/21 19:43
 */
public class SendFactory {

    public Sender produce(String type){
        if ("mail".equals(type)){
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("请输入正确的类型");
            return null;
        }
    }

}
