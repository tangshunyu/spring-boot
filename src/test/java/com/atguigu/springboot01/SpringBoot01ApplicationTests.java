package com.atguigu.springboot01;

import com.atguigu.springboot01.bean.person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01ApplicationTests {
    @Autowired
    person p;
    @Test
    public void contextLoads() {
        System.out.println(
                p
        );
    }

}
