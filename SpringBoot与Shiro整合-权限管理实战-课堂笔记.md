**《SpringBoot与Shiro整合-权限管理实战》**

**课程大纲**

l 课程内容简介

l SpringBoot与Shiro框架简介

l SpringBoot快速入门

l Spring Boot与Shiro整合实现用户认证

l Spring Boot与Shiro整合实现用户授权 

l thymeleaf和shiro标签整合使用

# 1. **课程内容简介**

## 1.1. **内容简介**

本课程主要讲解如何使用Spring Boot与Shiro进行整合使用，实现强大的用户权限管理，其中涉及如何完成用户认证（即用户登录），用户授权，thymeleaf页面整合shiro权限标签等知识点。

## 1.2. **课程目标**

快速掌握SpringBoot与Shiro安全框架的整合使用

## 1.3. **课程相关软件**

Eclipse Mar2

Spring Boot 1.5.4.RELEASE

Shiro1.4.0

# 2. **Spring Boot与Shiro框架简介**

## 2.1. **Spring Boot框架简介**

Spring的诞生是 Java 企业版（Java Enterprise Edition，JEE，也称 J2EE）的

轻量级代替品。无需开发重量级的 Enterprise JavaBean（EJB），Spring 为企业级

Java 开发提供了一种相对简单的方法，通过依赖注入和面向切面编程，用简单的Java 对象（Plain Old Java Object，POJO）实现了 EJB 的功能。

 

虽然 Spring 的组件代码是轻量级的，但它的配置却是重量级的。

 

所有Spring配置都代表了开发时的损耗。 因为在思考 Spring 特性配置和解决业务问题之间需要进行思维切换，所以写配置挤占了写应用程序逻辑的时间。除此之外，项目的依赖管理也是件吃力不讨好的事情。决定项目里要用哪些库就已经够让人头痛的了，你还要知道这些库的哪个版本和其他库不会有冲突，这难题实在太棘手。并且，依赖管理也是一种损耗，添加依赖不是写应用程序代码。一旦选错了依赖的版本，随之而来的不兼容问题毫无疑问会是生产力杀手。

 

Spring Boot 让这一切成为了过去。

Spring Boot 简化了基于Spring的应用开发，只需要“run”就能创建一个独立的、生产级别的Spring应用。Spring Boot为Spring平台及第三方库提供开箱即用的设置（提供默认设置），这样我们就可以简单的开始。多数Spring Boot应用只需要很少的Spring配置。 

 

我们可以使用SpringBoot创建java应用，并使用java –jar 启动它，或者采用传统的war部署方式。  

 

Spring Boot 主要目标是：

l 为所有 Spring 的开发提供一个从根本上更快的入门体验。

l 开箱即用，但通过自己设置参数，即可快速摆脱这种方式。

l 提供了一些大型项目中常见的非功能性特性，如内嵌服务器、安全、指标，健康检测、外部化配置等。 

l 绝对没有代码生成，也无需 XML 配置。 

## 2.2. **Shiro框架简介**

Apache Shiro是一个强大且易用的Java安全框架，执行身份验证、授权、密码学和会话管理。使用Shiro的易于理解的API,您可以快速、轻松地获得任何应用程序,从最小的移动应用程序到最大的网络和企业应用程序。

 

Apache Shiro 体系结构 

![img](file:///C:\Users\FENGFE~1\AppData\Local\Temp\ksohtml\wps7FC.tmp.jpg) 

1、 Authentication 认证 ---- 用户登录

2、 Authorization 授权 --- 用户具有哪些权限

3、 Cryptography 安全数据加密 

4、 Session Management 会话管理 

5、 Web Integration web系统集成 

6、 Interations 集成其它应用，spring、缓存框架

# 3. **Spring Boot快速入门**

## 3.1. **建立Maven项目，导入spring boot父工程**

![img](file:///C:\Users\FENGFE~1\AppData\Local\Temp\ksohtml\wps7FD.tmp.jpg) 

![img](file:///C:\Users\FENGFE~1\AppData\Local\Temp\ksohtml\wps80E.tmp.jpg) 

![img](file:///C:\Users\FENGFE~1\AppData\Local\Temp\ksohtml\wps80F.tmp.jpg) 

 

修改pom.xml：

## 3.2. **导入web支持**

修改pom.xml

## 3.3. **编写测试Controller类**

## 3.4. **编写SpringBoot启动类**

## 3.5. **导入thymeleaf页面模块**

l 引入thymeleaf依赖

 

 

l 在Controller添加测试方法

 

 

l 建立test.html页面

 

在src/main/resource目录下创建templates目录，然后创建test.html页面

 

 

在thymeleaf3.0以前对页面标签语法要求比较严格，开始标签必须有对应的结束标签。

 

如果希望页面语法不严谨，但是也能够运行成功，可以把thymeleaf升级为3.0或以上版本。

 

升级thymeleaf3.0.2版本：

# 4. **Spring Boot与Shiro整合实现用户认证**

## 4.1. **分析Shiro的核心API**

Subject： 用户主体（把操作交给SecurityManager）

SecurityManager：安全管理器（关联Realm）

Realm：Shiro连接数据的桥梁

## 4.2. **Spring Boot整合Shiro**

### 4.2.1. **导入shiro与spring整合依赖**

修改pom.xml

 

### 4.2.2. **自定义Realm类**

 

### 4.2.3. **编写Shiro配置类（\*）**

 

## 4.3. **使用Shiro内置过滤器实现页面拦截**

 

## 4.4. **实现用户认证（登录）操作**

### 4.4.1. **设计登录页面**

 

### 4.4.2. **编写Controller的登录逻辑**

 

### 4.4.3. **编写Realm的判断逻辑**

 

## 4.5. **整合MyBatis实现登录**

### 4.5.1. **导入mybatis相关的依赖**

 

### 4.5.2. **配置application.properties**

位置：src/main/resources目录下

 

 

### 4.5.3. **编写User实体**

 

### 4.5.4. **编写UserMapper接口**

 

### 4.5.5. **编写UserMapper.xml映射文件**

### 4.5.6. **编写业务接口和实现**

接口：

 

实现；

 

### 4.5.7. **添加@MapperScan注解**

 

### 4.5.8. **修改UserRealm**

# 5. **Spring Boot与Shiro整合实现用户授权**

## 5.1. **使用Shiro内置过滤器拦截资源**

## 5.2. **完成Shiro的资源授权**

UserRealm：

 

# 6.  **thymeleaf和shiro标签整合使用**

## 6.1. **导入thymeleaf扩展坐标**

## 6.2. **配置ShiroDialect**

在ShiroConfig类里面添加getShiroDialect方法

## 6.3. **在页面上使用shiro标签**

 

#  

 

 