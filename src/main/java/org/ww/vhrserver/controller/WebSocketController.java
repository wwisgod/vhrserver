package org.ww.vhrserver.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.ww.vhrserver.model.ChatMsg;

import java.security.Principal;

/**
 * @Author ww
 * @Date 2021/7/21 16:26
 */
@Controller
public class WebSocketController {
    /**
     * 消息的接收和转发
     */
    @MessageMapping("/ws/chat")
    public void chat(ChatMsg chatMsg, Principal principal) {
    }

}
