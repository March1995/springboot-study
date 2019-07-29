## SpringBoot使用SpringDataJPA完成CRUD

## 开启Druid监控功能

## 配置使用FastJson返回Json视图

## 如何在SpringBoot项目中使用拦截器

## SpringBoot整合jsp

测试了好多次，现在发现是这样的：

- 如果main 方法所在的项目是maven顶级项目，则用main方法运行，可以访问jsp
- 如果main方法所在的项目是maven的子模块项目（如 Main-Parent项目中，包含maven-A子模块，正好main方法就在maven-A 模块中）则main方法运行，无法访问jsp,必须spring-boot:run启动
- https://segmentfault.com/a/1190000009785247
