package com.example.securechat;

import lombok.Data;

/*
   File: ChatMessageController.java
   Date       Author      Changes
   May  5 21  Patryk Polak      Created
   May 30 21  Patryk Polak      Added Draft Documentation
   May 31 21  Patryk Polak Edited documentacion
*/

@Data
/**
 * class ChatMessage has two variables
 * @version	1.6 28 May 2021
 * @author 	Patryk Polak
 * @param value
 * @param user
 */
public class ChatMessage {
    private String value;
private String user;
    /**
     * variables for tests
     */
     String value_test = "test_value123";
     String user_test = "default_user123";

    /**
     * Constructor that take value
     * @param value
     */
    public ChatMessage(String value,String user) {
        this.value = value;
        this.user = user;
    }

    /**
     * default Constructor
     */
    public ChatMessage() {
    }

    /**
     * setters for tests
     * @param value
     * @return actual value
     */
    public String setValue_test(String value){
        return this.value;
    }

    public String setUser_test(String user) {
        return this.user;
    }




}
