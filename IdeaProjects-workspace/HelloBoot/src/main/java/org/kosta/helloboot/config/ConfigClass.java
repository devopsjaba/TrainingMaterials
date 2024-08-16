package org.kosta.helloboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {          // new ConfigClass()

    public ConfigClass() {
        System.out.println("ConfigClass 생성자 호출");
    }

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
