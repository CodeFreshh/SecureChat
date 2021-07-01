package com.example.securechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
   File: ChatMessageApplication.java
   Date       Author      Changes
   May  4 21  Patryk Polak      Created
   May 30 21  Patryk Polak      Added new conventions
*/

 /** @version  1.6 28 May 2021
     @author   Patryk Polak
  */

@SpringBootApplication
public class SecureChatApplication {
    /**
     * main class that runs Spring Boot app
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SecureChatApplication.class, args);
    }

}
