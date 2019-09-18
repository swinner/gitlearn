package com.swinner.gitlearn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {

    @RequestMapping("/index")
    public String getIndex(){
        System.out.printf("dev 本地提交");
        System.out.printf("github YUANCHGENBG提交");
        return "getIndex hello  dddd";
    }
}
