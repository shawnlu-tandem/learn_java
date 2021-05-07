package com.tandem.payments.aop.example1;

import org.springframework.stereotype.Service;

@Service
public class FeatureService {

    @AcceccCheck
    public boolean doSomething() {
        System.out.println("Doing something");
        return true;
    }

    @AcceccCheck
    public boolean doAnotherThing() {
        System.out.println("Doing another thing");
        return true;
    }

}
