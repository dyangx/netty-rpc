package com.rpc.provider.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author: yangj
 * @date: Created in 2021/1/7
 */
@Configuration
public class ProviderAutoConfiguration {

    @Autowired
    private RpcProperties rpcProperties;



}
