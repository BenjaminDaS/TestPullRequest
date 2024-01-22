package com.example.testaction;

import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestActionApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        int a = 1;
    }

    @Test
    void test2() throws Exception {
        if(1 != 2) {
            throw new Exception();
        }
    }
}
