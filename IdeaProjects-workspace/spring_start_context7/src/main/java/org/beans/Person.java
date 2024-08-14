package org.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component      // 스테레오타입 애너테이션. 스프링이 이 클래스 타입의 빈을 생성하고 추가
public class Person {
    private String name = "코스타";


    private Parrot parrot;

                                    // 스프링이 Person 타입의 빈을 생성할 때 이 생성자를 호출함
    // @Autowired                     // 스프링은 매개변수 값으로 컨텍스트에서 Parrot 타입의 빈을 전달함.
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
