package com.welkin.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * User: 章华隽
 * E-mail: nefeed@163.com
 * Desc:
 * Date: 2017-08-25
 * Time: 23:06
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    protected static final String TAG = "ZuulApplication";

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
