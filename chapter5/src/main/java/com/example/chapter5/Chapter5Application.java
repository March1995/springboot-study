package com.example.chapter5;

import com.example.chapter5.importSelector.EnableMyProperties;
import com.example.chapter5.property.MyPropertyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableMyProperties
public class Chapter5Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Chapter5Application.class, args);
		MyPropertyService bean1 = (MyPropertyService) context.getBean("bean1");
		MyPropertyService bean2 = (MyPropertyService) context.getBean("bean2");
		System.out.println(bean1.getInfo());
		System.out.println(bean2.getIsShow());
	}
}
