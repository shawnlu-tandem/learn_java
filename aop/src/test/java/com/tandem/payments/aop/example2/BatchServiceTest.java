package com.tandem.payments.aop.example2;

import com.tandem.payments.aop.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BatchServiceTest {

    @Autowired
    BatchService batchService;

    @Test
    public void testFindById() {
        batchService.findById(99);
    }

}
