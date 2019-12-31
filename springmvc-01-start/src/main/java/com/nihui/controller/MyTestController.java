package com.nihui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname MyTestController
 * @Description TODO
 * @Date 2019/12/31 2:47 PM
 * @Created by nihui
 */
@Controller
@RequestMapping("/test")
public class MyTestController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }
}
