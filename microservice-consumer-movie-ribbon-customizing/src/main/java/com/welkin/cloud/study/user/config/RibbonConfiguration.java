package com.welkin.cloud.study.user.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: 章华隽
 * E-mail: nefeed@163.com
 * Desc: 该类为Ribbon的配置类；注意：该类不应该在祝应用程序上下文的@ComponentScan中
 * Date: 2017-07-22
 * Time: 23:24
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule() {
        // 负载均衡修改为随机规则
        return new RandomRule();
    }
}
