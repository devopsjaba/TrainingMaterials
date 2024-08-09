package org.kosta;

import org.springframework.stereotype.Component;

@Component          /*  스프링은 이 클래스의 인스턴스를 생성하고 스프링 켄텍스트에 추가함 */
public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


