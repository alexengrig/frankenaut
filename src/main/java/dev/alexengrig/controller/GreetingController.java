package dev.alexengrig.controller;

import dev.alexengrig.service.GreetingService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Post("/{name}")
    public String greet(String name) {
        return greetingService.greet(name);
    }
}
