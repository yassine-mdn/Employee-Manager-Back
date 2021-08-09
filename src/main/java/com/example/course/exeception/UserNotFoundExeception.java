package com.example.course.exeception;

public class UserNotFoundExeception extends RuntimeException {
    public UserNotFoundExeception(String message) {
        super(message);
    }
}
