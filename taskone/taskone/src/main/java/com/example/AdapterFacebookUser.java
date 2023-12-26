package com.example;

import java.util.Date;

public class AdapterFacebookUser implements User{

    FacebookUser User;

    public AdapterFacebookUser(FacebookUser user){
        this.User = user;
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
