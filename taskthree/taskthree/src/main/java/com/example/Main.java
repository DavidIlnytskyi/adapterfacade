package com.example;

public class Main{
    public static void main(String[] args){
        String url = "https://www.youtube.com/";
        Company company = PDLReader.getCompanyInfo(url);
        System.out.println(company);
    }
}