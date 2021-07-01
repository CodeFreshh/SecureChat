package com.example.securechat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/*
   File: ChatMessageController.java
   Date       Author      Changes
   May  4 21  Patryk Polak      Created
   May 15 21  Patryk Polak      Fixed one Issue
   May 30 21  Patryk Polak      Added Documentation
*/

/**
 * A class representing main mechanism that controll all messages.
 * @see
 * @version	1.6 28 May 2021
 * @author 	Patryk Polak
 */
@Controller
public class ChatMessageController {
    @MessageMapping("/SecureChatApplication")
@SendTo("/main/ChatMessage")
    /**
     * Instance of ChatMessage class that takes
     * @param chatMessage
     * @return
     */
    public String get(String chatMessage) {
    return chatMessage;


}

    /**
     * variable for tests
     */
    String StringTest = "test";
}
