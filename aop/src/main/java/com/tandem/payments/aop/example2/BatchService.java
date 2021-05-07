package com.tandem.payments.aop.example2;

import org.springframework.stereotype.Service;

@Service
public class BatchService {
    public String findById(Integer id) {
        return "This is a batch: " + id.toString();
    }
}
