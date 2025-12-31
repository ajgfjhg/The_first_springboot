package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 通过邮箱查找用户（自定义查询方法）
    User findByEmail(String email);

    // 检查邮箱是否已存在
    boolean existsByEmail(String email);
}