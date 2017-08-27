package com.welkin.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * User: 章华隽
 * E-mail: nefeed@163.com
 * Desc:
 * Date: 2017-08-27
 * Time: 23:26
 */
@SpringBootApplication
@EnableSidecar
public class SidecarApplication {
    protected static final String TAG = "SidecarApplication";

    public static void main(String[] args) {
        SpringApplication.run(SidecarApplication.class, args);
    }
}
