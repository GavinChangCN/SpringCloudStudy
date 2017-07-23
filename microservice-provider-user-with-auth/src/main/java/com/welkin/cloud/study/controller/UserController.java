package com.welkin.cloud.study.controller;

import com.welkin.cloud.study.entity.User;
import com.welkin.cloud.study.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * User: Gavin
 * E-mail: GavinChangCN@163.com
 * Desc:
 * Date: 2017-06-20
 * Time: 17:10
 */
@RestController
public class UserController {
    protected static final String TAG = "UserController";

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;



    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            UserDetails user = (UserDetails) principal;
            Collection<? extends GrantedAuthority> collection = user.getAuthorities();
            for (GrantedAuthority c : collection) {
                // 打印当前登陆用户的信息
                UserController.LOGGER.info("当前用户是{}，角色是{}", user.getUsername(), c.getAuthority());
            }
        } else {
            // do other things
        }
        User findOne = this.userRepository.findOne(id);
        return findOne;
    }
}
