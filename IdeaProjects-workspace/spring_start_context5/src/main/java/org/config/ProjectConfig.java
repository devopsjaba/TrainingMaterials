package org.config;

import org.beans.Parrot;
import org.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean       // 스프링은 parrot()메서드를 호출하여 앵무새 빈을 생성하고 컨텍스트에 추가함
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("참앵무");
        return parrot;
    }

    @Bean     // 메서드에 대한 매개변수를 정의하여 스프링 컨텍스트에서 빈을 제공하도록 스프링에 지시함
    public Person person(Parrot parrot) {  // 스프링은 이 매개변수에 앵수새 빈을 주입함
        Person person = new Person();
        person.setName("코스타");
        person.setParrot(parrot);     // 스프링이 전달한 참조로 사람의 속성 값을 설정함
        return person;
    }
}
