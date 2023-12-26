package com.example;

import com.example.Database;

public class Autorization {
    public static boolean autorizate(Database db) {
        db.getUserData();
        return true;
    }
}
