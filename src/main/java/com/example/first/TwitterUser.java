package com.example.first;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class TwitterUser {
    private String userMail;
    private String userCountry;
    private LocalDateTime lastActiveDate;
}
