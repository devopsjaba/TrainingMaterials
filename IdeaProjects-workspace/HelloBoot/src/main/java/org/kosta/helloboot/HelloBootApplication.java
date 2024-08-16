package org.kosta.helloboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @(애노테이션) - 메타데이터, 전처리
@SpringBootApplication      // MVC 관련 API - FrontController, HanderMapping, ViewResolver, POJO, Service, Repository
// @Configuration
// @EnableAutoConfiguration
// @ComponetScan   // @Controller, @Service, @Repository
public class HelloBootApplication {

    //여기서부터 프로그램이 동작
    public static void main(String[] args) {
        SpringApplication.run(HelloBootApplication.class, args);
    }

}
