package com.example.demo.resources.request;

import org.springframework.util.StringUtils;

import java.util.function.Predicate;

public class LoggableUser {
    private String userName;
    private String passWord;

    public LoggableUser(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public boolean isValid() {
        return !(StringUtils.isEmpty(passWord) || StringUtils.isEmpty(userName));
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
}
