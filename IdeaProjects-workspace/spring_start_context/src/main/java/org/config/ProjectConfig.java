package org.config;

import org.kosta.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration              /* 이 클래스를 스프링 구성 클래스로 정의함  */
public class ProjectConfig {

    @Bean  /* 스프링에 켄텍스트가 초기화될 때  이 메서드를 호출하고 반환된 값을 켄텍스트에 추가를 지시함 */
    Parrot parrot() {       /* 빈을 반환하는 메서드 생성 */
        var parrot = new Parrot();
        parrot.setName("왕관앵무");
        return parrot;      /* Parrot 인스턴스를 켄텍스트에 추가함 */
    }

    @Bean   /* 스프링 켄텍스트에 "Hello" 문자열 추가 */
    String hello() {
        return "hello";
    }

    @Bean  /* 스프링 켄텍스트에 정수 10 추가 */
    Integer ten() {
        return 10;
    }
}
