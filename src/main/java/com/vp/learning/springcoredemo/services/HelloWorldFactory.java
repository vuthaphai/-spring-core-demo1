package com.vp.learning.springcoredemo.services;

public class HelloWorldFactory {
    public HelloWorldService createHelloWorldService(String language){
        HelloWorldService service = null;

        switch (language){
            case "en":
                service = new HelloWorldServiceEnglishImp();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImp();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            case "de":
                service = new HelloWorldServiceGermanImpl();
                break;
            case "pl":
                service = new HelloWorldServicePolish();
                break;
            case "ru":
                service = new HelloWorldServiceRussianImpl();
                break;
            default: new HelloWorldServiceEnglishImp();
        }

        return service;
    }
}
