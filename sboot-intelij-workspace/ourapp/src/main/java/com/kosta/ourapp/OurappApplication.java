package com.kosta.ourapp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OurappApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(OurappApplication.class);
		//애플리케이션 배너 제거
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.setBannerMode(Banner.Mode.CONSOLE);
		application.run(args);
	}

}
