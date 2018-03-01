package com.zhu.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {
    @RequestMapping(value ="/index")
    public String index(){
        System.out.print("ok");
        return "index";//主页面
    }
    @RequestMapping(value ="/{page}",method = RequestMethod.GET)
    public String page(@RequestParam("page")String page){

        return page;
    }
}
