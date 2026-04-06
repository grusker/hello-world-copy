package com.example.hello.controller;

import com.example.hello.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final GreetingService greetingService;

    // This line is to test the long lines, so writing so gibberish comment here. Arise now, arise, Riders of Théoden! Dire deeds awake: dark is it eastward. Let horse be bridled, horn be sounded! Forth Eorlingas! Arise, arise, Riders of Théoden! Fell deeds awake: fire and slaughter! Spear shall be shaken, shield be splintered, a sword-day, a red day, ere the sun rises! Ride now, ride now! Ride to Gondor!
    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "World") String name) {
        return greetingService.generateGreeting(name);
    }
}
