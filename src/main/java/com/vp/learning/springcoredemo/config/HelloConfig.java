package com.vp.learning.springcoredemo.config;

import com.vp.learning.springcoredemo.services.HelloWorldFactory;
import com.vp.learning.springcoredemo.services.HelloWorldService;
import com.vp.learning.springcoredemo.services.HelloWorldServiceEnglishImp;
import com.vp.learning.springcoredemo.services.HelloWorldServiceSpanishImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory){
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
        return factory.createHelloWorldService("es");
    }


}
