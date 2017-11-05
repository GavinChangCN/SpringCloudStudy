package com.welkin.cloud.study.repository;

import com.welkin.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户业务类
 *
 * @author: Gavin
 * E-mail: GavinChangCN@163.com
 * Date: 2017-06-20
 * Time: 17:09
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
