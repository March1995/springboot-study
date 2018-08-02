## 13.自定义maven-starter和注解添加配置文件进入IOC

### 一：自定义maven-starter

1.在外部配置文件中（application.yml）添加属性  看是否需要

2.编写Myproperties类读取外部配置文件（使用@ConfigurationProperties注解，该注解并未把该类注入ioc）

3.MyPropertyAutoConfiguration类，@EnableConfigurationProperties(Myproperties.class)
该注解把配置类注册并注入IOC，即添加了该注解在spring中才能获取配置类

4.编写MyPropertyAutoConfiguration类其他代码，注册MyPropertyService Bean 

通过以上步骤，在IOC中即可拿到生成的MyPropertyService实例,

```
ConfigurableApplicationContext context = SpringApplication.run(Chapter5Application.class, args);
		MyPropertyService bean1 = (MyPropertyService) context.getBean("bean1");
```

5.要在别的模块或者项目中使用该starter，需要再resources目录下新建meta-inf文件夹，添加spring.factories文件
AutoConfigurationImportSelector加载的原理,这样install之后别的项目配置jar包之后，便能直接使用该bean，参考chapter1

```
org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.example.chapter5.property.MyPropertyAutoConfiguration
```

### 二：ImportSelector的使用（解决需求：**定义一个Annotation，让使用了这个Annotaion的应用程序自动化地注入一些类或者做一些底层的事情。**）

1.在外部配置文件中（application.yml）添加属性  看是否需要 

2.编写MyConfiguration类，若需要注入配置类，该类用于注册bean

3.MyImportSelector实现ImportSelector接口，返回的参数为MyConfiguration类名，即该类控制添加注入IOC的配置类

4.编写EnableMyProperties注解，重要：@Import(MyImportSelector.class) 表示在运用的时候需要获取该类时，把该类注入到当前容器(生成注入bean的一种方式)。

5.需要使用MyConfiguration类注册的bean时，添加@EnableMyProperties即可，生成jar包后别的模块就能使用，无需添加pring.factories文件