package com.welkin.cloud.study.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * User: 章华隽
 * E-mail: nefeed@163.com
 * Desc:
 * Date: 2017-08-18
 * Time: 15:45
 */
@Configuration
public class FeignDisableHystrixConfiguration {
    protected static final String TAG = "FeignDisableHystrixConfiguration";

    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
