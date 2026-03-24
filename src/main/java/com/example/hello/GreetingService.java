package com.example.hello;

import com.example.hello.GreetingRepository;
import com.example.hello.StringUtil;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String generateGreeting(String name) {
        String greeting = greetingRepository.findGreeting();
        String capitalizedName = StringUtil.capitalize(name);
        return greeting + ", " + capitalizedName + "!";
    }
}
