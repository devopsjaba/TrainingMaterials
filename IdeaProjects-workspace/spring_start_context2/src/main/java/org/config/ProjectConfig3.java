package org.config;

import org.kosta.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig3 {

    @Bean(value = "love")
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("사랑앵무");
        return p;
    }

    @Bean
    @Primary    /* 같은 종류의 빈을 여러 개 가질 수 있지만 이름을 사용하여 빈을 참조해야 함.  그 중 하나를 기본(primary) 빈으로 만듦 */
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("회색앵무");
        return p;
    }

    @Bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("러브버드");
        return p;
    }

}
