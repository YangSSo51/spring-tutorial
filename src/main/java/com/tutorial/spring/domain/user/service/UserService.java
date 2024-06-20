package com.tutorial.spring.domain.user.service;

import com.tutorial.spring.domain.user.dto.request.UserJoinRequest;
import com.tutorial.spring.domain.user.entity.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    @Transactional
    User joinUser(UserJoinRequest userJoinRequest);
}
