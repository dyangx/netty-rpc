package com.rpc.consumer.web;

import com.rpc.api.user.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yangj
 * @date: Created in 2020/12/30
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private HelloService helloService;

    @RequestMapping("/get")
    public Object getUser(){
        return helloService.sayHello("yancy");
    }
}
