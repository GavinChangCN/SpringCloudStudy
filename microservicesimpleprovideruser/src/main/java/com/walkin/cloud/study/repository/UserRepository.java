package com.walkin.cloud.study.repository;

import com.walkin.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User: Gavin
 * E-mail: GavinChangCN@163.com
 * Desc:
 * Date: 2017-06-20
 * Time: 17:09
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
