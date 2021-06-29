package com.sunntry.lspublicsystemhub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LSController {

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
      return "hello world";
    };

    @RequestMapping("/main")
    @ResponseBody
    public String main(){
        return "成功";
    };
}
