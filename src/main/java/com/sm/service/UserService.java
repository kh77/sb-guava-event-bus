package com.sm.service;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.sm.dto.User;
import com.sm.event.NotificationCreatedEvent;
import com.sm.event.UserCreatedEvent;
import com.sm.repo.UserRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {

    private final EventBus userEventBus;
    private final AsyncEventBus notificationAsyncEventBus;

    public User create(User user) {
        Long id = UserRepo.incrementId();
        UserRepo.save(id, user);
        user.setId(id);
        // async
        notificationAsyncEventBus.post(new NotificationCreatedEvent(id));
        //sync
        userEventBus.post(new UserCreatedEvent(id));
        return user;
    }
}
