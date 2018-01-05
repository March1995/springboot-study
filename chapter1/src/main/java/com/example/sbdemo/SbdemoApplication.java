package com.example.sbdemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kunzite
 */
@SpringBootApplication
public class SbdemoApplication {

	public static void main(String[] args) {
		/**
		 * 隐藏banner启动方式
		 */
		SpringApplication springApplication = new SpringApplication(SbdemoApplication.class);
		//设置banner的模式为隐藏
		springApplication.setBannerMode(Banner.Mode.OFF);

		SpringApplication.run(SbdemoApplication.class, args);
	}
}
