package com.tandem.payments.aop.example1;

public class CurrentUser {
    static String username;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        CurrentUser.username = username;
    }
}
