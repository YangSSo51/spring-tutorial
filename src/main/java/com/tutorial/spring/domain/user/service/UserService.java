package com.tutorial.spring.domain.user.service;

import com.tutorial.spring.domain.user.dto.request.UserJoinRequest;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    @Transactional
    void joinUser(UserJoinRequest userJoinRequest);
}
