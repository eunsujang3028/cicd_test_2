package org.example.cicdtest2.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainController {

    @Test
    void hello() {
        Assertions.assertTrue(true);
//        throw new RuntimeException("강제 오류 발생");
    }
}
