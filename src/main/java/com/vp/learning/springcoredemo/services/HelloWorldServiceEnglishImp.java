package com.vp.learning.springcoredemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


public class HelloWorldServiceEnglishImp implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Hello World!!!";
    }
}
