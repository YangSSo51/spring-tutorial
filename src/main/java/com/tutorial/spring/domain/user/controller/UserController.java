package com.tutorial.spring.domain.user.controller;

import com.tutorial.spring.domain.user.dto.request.UserJoinRequest;
import com.tutorial.spring.domain.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
@Tag(name = "회원 API", description = "회원 관리용 API")
public class UserController {
    private final UserService userService;

    @PostMapping("/join")
    @Operation(summary = "회원가입",description = "일반 회원가입")
    public ResponseEntity<String> joinUser(@Valid @RequestBody UserJoinRequest user){
        System.out.println(user.toString());

        return new ResponseEntity<String>("ok", HttpStatus.CREATED);
    }
}
