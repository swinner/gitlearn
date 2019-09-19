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

        System.out.printf("本地   第二次提交");

        System.out.printf("本地   第三次提交");

        System.out.printf("本地   第四次提交");

        System.out.printf("远程   第四次提交");

        System.out.printf("远程   第五次提交");


        System.out.printf("本地   第五次提交");

        System.out.printf("远程   第六次提交");

        System.out.printf("本地   第六次提交  XIUGAI  第六次提交   又来一个第六次提交 提交");

        System.out.printf("本地   第七次提交");

        System.out.printf("本地   第八次提交  会滚到第五次");
        
        System.out.printf("远程   第jiu次提交");


        return "getIndex hello  dddd  XXXXX";

    }
}
