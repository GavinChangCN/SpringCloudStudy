package com.welkin.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: Gavin
 * E-mail: GavinChangCN@163.com
 * Desc:
 * Date: 2017-06-20
 * Time: 17:30
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderUserApplication {
    protected static final String TAG = "ProviderUserApplication";

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }
}
