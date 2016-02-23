package com.firstutility.jh.chat;

import java.util.Scanner;

public class TerminalChat {
    public static void main(String[] args) {
        Chat chat = new Chat();
        Scanner in = new Scanner(System.in);
        chat.init();
        
        System.out.println("The robot is listening...");
        
        while(in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(chat.say(line));
        }
    }
}
