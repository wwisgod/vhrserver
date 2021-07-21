package org.ww.vhrserver.model;

/**
 * @Author ww
 * @Date 2021/7/21 16:23
 */

/**
 * websocket消息对象
 */
public class ChatMsg {
    private String to;
    private String from;
    private String context;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
