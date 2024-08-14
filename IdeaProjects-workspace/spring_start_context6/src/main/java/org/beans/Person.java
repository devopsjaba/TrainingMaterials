package org.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component      // 스테레오타입 애너테이션. 스프링이 이 클래스 타입의 빈을 생성하고 추가
public class Person {
    private String name = "코스타";

    @Autowired      // 스프링이 스프핑 켄텍스트에서 빈을 가져와 직접 설정함 => 두 빈 사이에 관계가 설정됨
    private Parrot parrot;      // 초기값 없이는 final 필드를 정의 할수 없으므로 컴파일 에러남

//    public Person(Parrot parrot) {
//        this.parrot = parrot;
//    }

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
