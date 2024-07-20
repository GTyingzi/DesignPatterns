package com.yingzi.design.behavioral.chainOfResponsibility.oa;

/**
 * @author yingzi
 * @date 2024/7/20 21:50
 */
public class OASystemClient {

    public static void main(String[] args) {
        // 创建具体处理者
        PMHandler pm = new PMHandler();
        DirectorHandler director = new DirectorHandler();
        MinisterHandler minister = new MinisterHandler();
        // 构建责任链
        HandlerChain chain = new HandlerChain()
                .addHandler(pm)
                .addHandler(director)
                .addHandler(minister);

        chain.handleRequest("王二", 7);
    }
}
