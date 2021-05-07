package com.tandem.demo.annotation.example1;

public class Test {

    @SuppressWarnings("deprecation")
    public void login() {
        UserService userService = new SubUserService();
        userService.login();
    }

}
