package com.example;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Autorization autorization = new Autorization();
        if (Autorization.autorizate(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
