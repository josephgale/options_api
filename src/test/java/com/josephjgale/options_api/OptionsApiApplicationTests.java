package com.josephjgale.options_api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

@SpringBootTest
class OptionsApiApplicationTests {

    String returnString = OptionsApiApplication.sayHello("World");
    @Test
    void contextLoads() {
    }

    @Test
    String sayHelloTest(String world){
       Assert.assertEquals("Hello Bob","Bob","Hi");
        return world;
    }

}
