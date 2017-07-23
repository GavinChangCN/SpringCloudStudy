package com.welkin.cloud.study.user.controller;

import com.welkin.cloud.study.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * User: Gavin
 * E-mail: GavinChangCN@163.com
 * Desc:
 * Date: 2017-06-20
 * Time: 22:19
 */
@RestController
@RequestMapping(value = "/", produces = "application/json;charset=UTF-8")
public class MovieController {
    protected static final String TAG = "MovieController";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("user.userServiceUrl")
    private String userServiceUrl;

    @GetMapping("user/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject(userServiceUrl + id, User.class);
    }

    /**
     * 查询 microservice-provider-user 服务的信息并返回
     *
     * @return microservice-provider-user 服务的信息
     */
    @GetMapping("user-instance")
    public List<ServiceInstance> showInfo() {
        return this.discoveryClient.getInstances("microservice-provider-user");
    }
}
