package com.welkin.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: 章华隽
 * E-mail: nefeed@163.com
 * Desc:
 * Date: 2017-08-26
 * Time: 16:46
 */
@SpringBootApplication
@EnableEurekaClient
public class FileUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileUploadApplication.class, args);
    }
}
