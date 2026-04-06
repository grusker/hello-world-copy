package com.example.hello;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepository {

    public String findGreeting() {
        // In a real app, this would query a database
        return "Hello there!";
    }
}
