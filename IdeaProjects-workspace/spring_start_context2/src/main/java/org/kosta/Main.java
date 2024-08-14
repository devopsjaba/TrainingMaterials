package org.kosta;

import org.config.ProjectConfig;
import org.config.ProjectConfig2;
import org.config.ProjectConfig3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);
        /* 예외 발생 -- 스프링은 사용자가 참조하는 Parrot 인스턴스 세 개 중 어떤 것 참조하는지 추정 불가함 */
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

/*        Parrot p = context.getBean("parrot2", Parrot.class);   // 첫번째 매개변수가 참조할 인스턴스 이름임
        System.out.println(p.getName());

        Parrot p2 = context.getBean("love", Parrot.class);   // 첫번째 매개변수가 참조할 인스턴스 이름임
        System.out.println(p2.getName());*/


    }
}