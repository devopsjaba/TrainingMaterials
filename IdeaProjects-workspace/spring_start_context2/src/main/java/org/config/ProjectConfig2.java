package org.config;

import org.kosta.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig2 {

    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("사랑앵무");
        return p;
    }

    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("회색앵무");
        return p;
    }

    @Bean(name = "love")    // 빈 이름 설정
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("러브버드");  // 앵무새 이름 설정
        return p;
    }

}
