package com.example;

import java.util.Date;

public class messageSender {
    public static void send(String text, User user, String country){
        if(wasActive(user)){
            System.out.println("Send message to: " + user.getUserMail());
            System.out.println("Message text is: " + text);
            System.out.println("User is from: " + country);
        }
    }

    public static boolean wasActive(User user){
        Date currentTime = new Date();
        return user.getLastActiveTime().getTime() - (long)currentTime.getTime() < 3600000;
    };
}
