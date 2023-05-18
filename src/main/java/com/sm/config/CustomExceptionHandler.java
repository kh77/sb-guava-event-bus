package com.sm.config;

import com.google.common.eventbus.SubscriberExceptionContext;
import com.google.common.eventbus.SubscriberExceptionHandler;

public class CustomExceptionHandler implements SubscriberExceptionHandler {
    @Override
    public void handleException(Throwable exception, SubscriberExceptionContext context) {
        // Custom exception handling logic
        System.err.println("Subscriber Exception: " + exception.getMessage());
    }
}







