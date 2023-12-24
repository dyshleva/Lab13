package com.example.first;

import java.time.LocalDate;

import com.example.first.TwitterUser;

public class MyTwitterUser implements User {
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getMail() {
        return twitterUser.getUserMail();

    }

    @Override
    public String getCountry() {
        return twitterUser.getUserCountry();
    }

    @Override
    public LocalDate getLastActiveDate() {
        return twitterUser.getLastActiveDate().toLocalDate();
    }
}
