package com.example.hello;

import com.example.hello.GreetingRepository;
import com.example.hello.GreetingService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GreetingServiceTest {

    @Mock
    private GreetingRepository greetingRepository;

    @InjectMocks
    private GreetingService greetingService;

    @Test
    void testGenerateGreeting() {
        when(greetingRepository.findGreeting()).thenReturn("Hello");
        String result = greetingService.generateGreeting("alice");
        assertEquals("Hello, Alice!", result);
    }

    @Test
    void testGenerateGreetingWithDifferentGreeting() {
        when(greetingRepository.findGreeting()).thenReturn("Hi");
        String result = greetingService.generateGreeting("bob");
        assertEquals("Hi, Bob!", result);
    }
}
