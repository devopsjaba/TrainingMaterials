package org.kosta;

import org.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 스프링 컨텍스트의 인스턴스 생성될 때 구성 클래스를 매개변수로 전송함, 스프링이 이를 사용하도록 함
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);   // 스프링 켄텍스트에서 Parrot 타입의 빈 참조를 가져옴
        System.out.println(p.getName());

        String s = context.getBean(String.class);   // 스프링은 빈 타입을 켄텍스트에서 찾음. 그러한 빈이 없다면 예외 발생됨.
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}