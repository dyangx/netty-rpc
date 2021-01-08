package com.rpc.provider.serviceImpl;

import com.rpc.api.user.HelloService;

/**
 * @author: yancy
 * @date: Created in 2021/1/7
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello,I am " + name;
    }
}
