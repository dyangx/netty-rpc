//package com.boot.web;
//
//import com.alibaba.dubbo.config.annotation.Reference;
//import com.boot.api.HelloService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author: yangj
// * @date: Created in 2020/12/30
// */
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    @Reference
//    private HelloService helloService;
//
//    @RequestMapping("/get")
//    public Object getUser(){
//        return helloService.getUrName();
//    }
//}
