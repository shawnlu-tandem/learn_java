package com.tandem.demo.annotation.exercise;

public class Main {

    public static void main(String[] args) {
        SpringContainer container = SpringContainer.getInstance();
        UserService userService = (UserService) container.getBeanByClass(UserService.class);

        // You should be able to see: My name is Convoy
        System.out.println(userService.queryUserNameById(1001));

    }
}
