package com.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Company{
    private String name;
    private String description;
    private String logoUrl;

    @Override
    public String toString(){
        return  "name=" + name +
                ", \ndescription=" + description +
                ", \nlogoUrl=" + logoUrl;
    }
}