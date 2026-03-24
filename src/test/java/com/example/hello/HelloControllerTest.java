package com.example.hello;

import com.example.hello.GreetingService;
import com.example.hello.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HelloControllerTest {

    @Mock
    private GreetingService greetingService;

    @InjectMocks
    private HelloController helloController;

    @Test
    void testIndex() {
        when(greetingService.generateGreeting("World")).thenReturn("Hello, World!");
        String result = helloController.index("World");
        assertEquals("Hello, World!", result);
    }
}
