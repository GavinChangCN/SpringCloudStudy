package com.welkin.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * User: 章华隽
 * E-mail: nefeed@163.com
 * Desc:
 * Date: 2017-08-18
 * Time: 23:17
 */
@SpringBootApplication
@EnableTurbineStream
public class TurbineApplication {
    protected static final String TAG = "TurbineApplication";

    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }
}
