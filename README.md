# Spring Boot Demo 项目

## 项目简介
这是我学习Spring Boot的第一个项目，实现了基本的RESTful API用户管理功能。

## 技术栈
- Spring Boot 4.0.1
- Spring Data JPA
- MySQL 8.2
- Maven 3.9.12
- Java 17

## 功能特性
- 用户信息的CRUD操作
- RESTful API接口
- 数据库自动表生成
- 单元测试示例

## 快速开始
1. 克隆项目: `git clone https://github.com/ajgfjhg/The_first_springboot.git`
2. 导入IDE（IntelliJ IDEA/Eclipse）
3. 配置MySQL数据库
4. 运行: `mvn spring-boot:run`
5. 访问: http://localhost:8080

## API接口
- GET /api/users - 获取所有用户
- POST /api/users - 创建用户
- GET /api/users/{id} - 获取单个用户
- PUT /api/users/{id} - 更新用户
- DELETE /api/users/{id} - 删除用户

## 项目结构
src/main/java/com/example/demo/
├── DemoApplication.java # 主启动类
├── User.java # 用户实体
├── UserRepository.java # 数据访问层
└── UserController.java # REST控制器

## 学习收获
通过本项目掌握了：
- Spring Boot项目创建和配置
- JPA数据持久化操作
- RESTful API设计规范
- Maven依赖管理
