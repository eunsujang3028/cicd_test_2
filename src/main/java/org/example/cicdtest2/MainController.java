package org.example.cicdtest2;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    @GetMapping
    public String hello() {
        return "this is cicd test2 ---- auto deployment";
    }
}
