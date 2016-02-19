package com.firstutility.jh.test.steps;

import com.firstutility.jh.chat.Chat;

import net.thucydides.core.annotations.Step;

public class ChatSteps {

    private Chat chat;

    @Step
    public void init() {
        this.chat = new Chat();
    }

    @Step
    public String say(String message) {
        return chat.say(message);
    }

}
