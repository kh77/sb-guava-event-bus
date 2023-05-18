package com.sm.config;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.sm.listener.NotificationCreatedEventListener;
import com.sm.listener.UserCreatedEventListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

@Configuration
public class EventBusConfig {

    @Bean
    public EventBus userEventBus() {
        EventBus eventBus = new EventBus(new CustomExceptionHandler());
        eventBus.register(new UserCreatedEventListener());
        return eventBus;
    }

    @Bean
    public AsyncEventBus notificationAsyncEventBus() {
        AsyncEventBus eventBus = new AsyncEventBus(Executors.newCachedThreadPool(), new CustomExceptionHandler());
        eventBus.register(new NotificationCreatedEventListener());
        return eventBus;
    }
}
