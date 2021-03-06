## 简介
spring-boot-ssm 是一个基于Spring Boot & Spring & Spring MVC & MyBatis的简单通用的项目，用于快速构建中小型API的后端服务系统. 可以做为一个种子项目,进行改造升级.

另外,还有个对应的Vue+ElementUI的前端项目[vue-admin](https://github.com/caoxile/vue-admin),同样可以作为一个web前端的种子项目。

这2个项目是集成测试过的，可以直接拿来开发项目。

## 特征
- [x] Spring Boot 2                                                                 
- [x] Spring MVC 		 		
- [x] Mybatis                
- [x] Spring Boot Test
- [x] 集成通用Mapper插件、PageHelper分页插件,实现单表业务的基本操作.
- [x] 统一的Response封装,统一的异常处理,基础方法的抽象封装.
- [x] 代码自动生成工具
- [x] Druid 集成阿里Druid数据库连接池以及API和数据库等监控            		
- [x] 日志管理(集成Logback)
- [x] 缓存框架(集成Redis)
- [x] 用户权限管理(集成Apache Shiro,Redis共享session)
- [x] 操作日志记录
- [ ] 任务调度(集成Quartz)

## 环境准备
1. MySql
2. Redis

## 快速启动
1. 克隆项目
```
    git clone https://github.com/caoxile/spring-boot-ssm.git
```
2. 初始化表

    执行bin/init_db.sql脚本,初始化表和数据

3. 对开发环境配置文件```application-dev.properties```进行配置(Mysql+Redis).
- Mysql配置
``` 
    spring.datasource.url=jdbc:mysql://localhost:3306/project?characterEncoding=utf-8&useSSL=false
    spring.datasource.username=tom
    spring.datasource.password=hellotom
```
- Redis 配置
```
# Redis服务器地址
spring.redis.host=localhost
# Redis服务器连接端口
spring.redis.port=6379
# Redis服务器连接密码（默认为空）
spring.redis.password=
```
4. 启动
```
    //在IDE中启动,或者直接执行下面命令
    mvn spring-boot:run
```

## 代码自动生成工具

1. 修改对```test```包内的代码生成器```CodeGenerator```的数据库链接等配置
```
    //JDBC配置
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/project";//数据库链接
    private static final String JDBC_USERNAME = "tom";//数据库用户名
    private static final String JDBC_PASSWORD = "hellotom";//数据库密码
    private static final String JDBC_DIVER_CLASS_NAME = "com.mysql.jdbc.Driver";//数据库驱动类型

```
2. 在```CodeGenerator.main```方法中,输入表名,然后运行.(即可在src下生成基础代码)
```
    public static void main(String[] args) {
        //genCode("auth","auth_user"); // 参数1:模块名 参数2:表名
        genCodeByCustomModelName("auth","auth_user","User"); // 参数1:模块名 参数2:表名 参数3:自定义Model名
    }
```
## 技术文档
- Spring Boot（[Spring Boot官方文档](https://spring.io/projects/spring-boot)）
- Spring MVC ([Spring MVC官方文档](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html))
- MyBatis（[官方中文文档](http://www.mybatis.org/mybatis-3/zh/index.html)）
- MyBatis 通用Mapper插件（[官方中文文档](https://mapperhelper.github.io/docs/)）
- MyBatis PageHelper分页插件（[官方中文文档](https://github.com/pagehelper/Mybatis-PageHelper/blob/master/README_zh.md)）
- Druid （[官方中文文档](https://github.com/alibaba/druid/wiki/%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98)）
- Druid监控（[监控配置和使用说明](https://www.caoxile.com/blog/2018/07/spring-boot-1-druid%E7%9B%91%E6%8E%A7)）
- Fastjson（[官方中文文档](https://github.com/alibaba/fastjson/wiki/Quick-Start-CN)）
- JWT(JSON Web Token) ([JWT介绍](https://www.caoxile.com/blog/2018/07/json-web-token))
- Apache Shiro([跟我学Shiro](https://jinnianshilongnian.iteye.com/blog/2018398))
- FEBS Shiro([FEBS后台权限管理系统](https://github.com/wuyouzhuguli/FEBS-Shiro))

## License
MIT


