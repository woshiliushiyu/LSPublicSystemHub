package com.sunntry.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LSController {

    @RequestMapping("/index")
    @ResponseBody
    public String main(){
        return "成功";
    };
}
