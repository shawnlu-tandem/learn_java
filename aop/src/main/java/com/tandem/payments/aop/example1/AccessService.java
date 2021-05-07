package com.tandem.payments.aop.example1;

import org.springframework.stereotype.Service;

@Service
public class AccessService {

    public void isAdmin() {
        if (!"admin".equals(CurrentUser.getUsername())) {
            throw new RuntimeException("You are not allowed");
        }
    }
}
