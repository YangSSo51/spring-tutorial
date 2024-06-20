package com.tutorial.spring.domain.user.service;

import com.tutorial.spring.domain.user.dto.request.UserJoinRequest;
import com.tutorial.spring.domain.user.entity.User;
import com.tutorial.spring.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    @Transactional
    public User joinUser(UserJoinRequest userJoinRequest){
        User user = User.builder()
                .userEmail(userJoinRequest.getUserEmail())
                .userPassword(userJoinRequest.getUserPassword())
                .build();

        try {
            return userRepository.save(user);
        }catch (Exception e){
            log.debug(e.getMessage());
            throw new RuntimeException();
        }
    }
}
