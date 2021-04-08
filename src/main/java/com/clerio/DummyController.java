package com.clerio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hellokube")
public class DummyController {
    @GetMapping
    public  String greeting(){
        return "hello Jembi devs \n";
    }
}
