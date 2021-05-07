package com.tandem.payments.aop.example1;

import com.tandem.payments.aop.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class FeatureServiceTest {

    @Autowired
    private FeatureService featureService;

    @Test
    public void testDoSomething() {
        CurrentUser.setUsername("admin");
        assert featureService.doSomething() == true;
    }

    @Test(expected = RuntimeException.class)
    public void testDoAnotherThing() {
        CurrentUser.setUsername("Bob");
        assert featureService.doAnotherThing() == true;
    }

}
