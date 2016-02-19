package com.firstutility.jh.chat;

public class Chat {

    private ChatState state = ChatState.starting;
    private String name;

    public void init() {

    }

    public String say(String message) {
        if ("Hello".equals(message)) {
            return respondToHello();
        }
        state = ChatState.ongoing;

        if (message.startsWith("My name is ")) {
            return respondToMyNameIs(message);
        }

        if (message.equals("Who am I?")) {
            return "You are " + name + ".";
        }

        if (message.equals("Robot?")) {
            return "Yes " + name + "?";
        }

        return "Mmmm...";
    }

    private String respondToMyNameIs(String message) {
        this.name = message.replace("My name is ", "");
        return "Good to hear from you " + name + ".";
    }

    private String respondToHello() {
        switch (state) {
        case starting:
            return "Hiya";
        default:
            return "It's a bit late for hello...";
        }
    }

    private enum ChatState {
        starting, ongoing
    }

}
