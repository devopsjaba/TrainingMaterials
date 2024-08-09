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

    @Bean     // 스프링은 person()메서드를 호출하여 사람 빈을 생성하고 컨텍스트에 추가함
    public Person person() {
        Person person = new Person();
        person.setName("코스타");
        person.setParrot(parrot());     // 사람의 앵무새 속성에 앵무새 빈의 참조를 설정함
        return person;
    }
}
