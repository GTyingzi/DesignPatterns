package com.yingzi.design.behavioral.chainOfResponsibility.oa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yingzi
 * @date 2024/7/20 21:54
 */
public class HandlerChain implements Handler{

    private List<Handler> handlerList;
    private boolean isHandled = false;

    public HandlerChain() {
        handlerList = new ArrayList<>();
    }

    public HandlerChain addHandler(Handler handler) {
        handlerList.add(handler);
        return this;
    }

    @Override
    public void handleRequest(String name, int days) {
        for (Handler handler : handlerList) {
            handler.handleRequest(name,days);
            if (handler.isRequestHandled()) {
                isHandled = true;
                break;
            }
        }
    }

    @Override
    public boolean isRequestHandled() {
        return isHandled;
    }

}
