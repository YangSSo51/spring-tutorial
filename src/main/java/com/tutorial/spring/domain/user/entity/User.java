package com.tutorial.spring.domain.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "common_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userNo;

    private String userEmail;
    private String userPassword;

    @CreatedDate
    private LocalDate joinDate;

    @LastModifiedDate
    private LocalDate modifyDate;
}