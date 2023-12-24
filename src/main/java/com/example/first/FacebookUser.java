package com.example.first;

import lombok.Data;
import lombok.Getter;
import java.time.LocalDateTime;

@Data
@Getter
public class FacebookUser {
    private String mail;
    private String userCountry;
    private LocalDateTime lastActiveDate;
}
