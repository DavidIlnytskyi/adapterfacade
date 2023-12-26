package com.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TwitterUser David = new TwitterUser("ilnytkyi@gmail.com", "Ukraine", new Date() );
        FacebookUser Kamilot = new FacebookUser("kamilot@gmail.com", "United Kingdom", new Date());

        User DavidBasic = new AdapterTwitterUser(David);
        User KamilotBasic = new AdapterFacebookUser(Kamilot);

        messageSender.send("Hello bois", DavidBasic, "Ukraine");
        messageSender.send("Hello kings", KamilotBasic, "United Kingdom");

    }
}