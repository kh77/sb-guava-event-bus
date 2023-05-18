package com.sm.listener;

import com.google.common.eventbus.Subscribe;
import com.sm.event.NotificationCreatedEvent;
import org.springframework.stereotype.Component;

@Component
public class NotificationCreatedEventListener {
    @Subscribe
    public void handleUserCreatedEvent(NotificationCreatedEvent event) {
        // Handle notification creation event
        System.out.println("Thread "+ Thread.currentThread().getName()+" - Notification created: " + event.getProductId());
    }
}
