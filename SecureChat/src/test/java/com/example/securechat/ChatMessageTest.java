package com.example.securechat;

import org.junit.Test;

public class ChatMessageTest {

    @Test
    public void CheckGetValue(){
        //given
        ChatMessage chatmessage = new ChatMessage();

        //when
        String CheckValue = chatmessage.getValue_test();


        //then

        assert equals(CheckValue.equals(chatmessage.getValue()));
    }

    @Test
    public void CheckGetUser(){
        //given
        ChatMessage chatmessage = new ChatMessage();


        //when
        String CheckUser = chatmessage.getUser_test();


        //then
        assert equals(CheckUser.equals(chatmessage.getUser()));

    }

    @Test
    public void CheckSettingUser(){

        //given
        ChatMessage chatmessage = new ChatMessage();

        //when
        String CheckSet = chatmessage.setUser_test("default_user123");

        //then
        assert equals(CheckSet.equals(chatmessage.user_test));


    }
@Test
    public void CheckSettingValue(){

        //given
        ChatMessage chatmessage = new ChatMessage();

        //when
        String CheckValue = chatmessage.setValue_test("test_value123");

        //then
     assert equals(CheckValue.equals(chatmessage.value_test));

    }

}
