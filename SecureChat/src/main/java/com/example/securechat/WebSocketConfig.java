package com.example.securechat;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/*
   File: ChatMessageController.java
   Date       Author       Changes
   May  5 21  Patryk Polak       Created
   May 10 21  Patryk Polak Fixed configuration
   May 30 21  Patryk Polak      Added Draft Documentation
*/

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /**
     * @version	1.6 28 May 2021
     * @author 	Patryk Polak
     * Registry of stomp endpoints
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
       registry.addEndpoint("/SecureChatApplication");
    }

    /**
     * Registry of configuration Message Broker which takes
     * @param registry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/main");
        registry.setApplicationDestinationPrefixes("/SecureChat");
    }
}

