package com.tutorial.spring.domain.user.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Schema(description = "회원가입을 위한 요청 객체")
public class UserJoinRequest {

    @NotBlank(message = "이메일을 입력해주세요.")
    @Size(max = 100, message = "이메일은 최대 100자 입니다.")
    @Email(message = "이메일 형식에 맞춰 입력해주세요.")
    @Schema(description = "이메일을 입력해주세요." , example = "test@gmail.com")
    private String userEmail;

    @NotBlank(message = "비밀번호를 입력해 주세요.")
    @Size(min = 8, max = 20, message = "비밀번호는 8자 이상 20자 이하여야 합니다.")
    @Schema(description = "비밀번호를 입력해주세요." , example = "test123!")
    private String userPassword;
}
