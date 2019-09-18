package com.swinner.gitlearn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {

    @RequestMapping("/index")
    public String getIndex(){
        return "getIndex hello";
    }
}
