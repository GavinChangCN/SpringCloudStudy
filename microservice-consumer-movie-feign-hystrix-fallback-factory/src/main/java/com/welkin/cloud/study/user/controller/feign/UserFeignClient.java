package com.welkin.cloud.study.user.controller.feign;

import com.welkin.cloud.study.user.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: 章华隽
 * E-mail: nefeed@163.com
 * Desc:
 * Date: 2017-07-23
 * Time: 22:57
 */
// 禁用Hystrix
// @FeignClient(name = "microservice-provider-user", configuration = FeignDisableHystrixConfiguration.class)
// 禁用Hystrix
@FeignClient(name = "microservice-provider-user", fallbackFactory = FeignClientFallbackFactory.class)
public interface UserFeignClient {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);
}


@Component
class FeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FeignClientFallbackFactory.class);

    @Override
    public UserFeignClient create(final Throwable throwable) {
        return new UserFeignClient() {
            @Override
            public User findById(Long id) {
                // 日志放在各个fallback方法中，而不是直接放在create方法中
                // 否则在引用启动时就会答应该日志
                FeignClientFallbackFactory.LOGGER.info("fallback; reason was:", throwable);
                User user = new User();
                user.setId(-1L);
                user.setUsername("默认用户");
                return user;
            }
        };
    }
}