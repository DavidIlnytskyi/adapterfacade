package com.example;

import java.util.Date;

public class AdapterTwitterUser implements User{

    private TwitterUser User;

    public AdapterTwitterUser(TwitterUser User){
        this.User = User;
    }

    public String getUserMail(){
        return User.UserMail;
    }

    public Date getLastActiveTime(){
        return User.LastActiveTime;
    }

    public String getCountry(){
        return User.Country;
    }
}
