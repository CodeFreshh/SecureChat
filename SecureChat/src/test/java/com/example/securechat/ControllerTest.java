package com.example.securechat;

import org.junit.Test;

public class ControllerTest {


    @Test
    public void isControllerWorks() {
//given
        ChatMessageController controllertest = new ChatMessageController();

//when

        String workingController = controllertest.get(controllertest.StringTest);

        //then
        assert equals(workingController.equals("test"));



    }
}