package dev.alexengrig.service;

import javax.inject.Singleton;

@Singleton
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet(String name) {
        return "Hello, " + name;
    }
}
