package com.rpc.provider.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: yangj
 * @date: Created in 2021/1/8
 */
@Data
@Component
@ConfigurationProperties(prefix = "rpc")
public class RpcProperties {

    private int port;
    private String registryAddr;
    private String registryType;
}
