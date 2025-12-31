package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")  // 指定数据库表名为"users"
@Data  // Lombok：自动生成getter、setter、toString等
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 自增主键
    private Long id;

    @Column(nullable = false, length = 50)  // 非空，最大50字符
    private String name;

    @Column(unique = true, length = 100)  // 唯一约束
    private String email;

    private Integer age;

    // JPA要求无参构造函数
    public User() {}

    // 方便创建对象的构造函数
    public User(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}