package com.sm.listener;

import com.google.common.eventbus.Subscribe;
import com.sm.event.UserCreatedEvent;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedEventListener {
    @Subscribe
    public void handleUserCreatedEvent(UserCreatedEvent event) {
        // Handle user creation event
        System.out.println("Thread " + Thread.currentThread().getName() + " - User created: " + event.getUserId());

        //   if exception occur then CustomExceptionHandler will be called
        // throw new RuntimeException("Exception occurred while handling event");
    }
}
