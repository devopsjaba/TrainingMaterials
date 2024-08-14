package org.kosta;

import org.beans.Parrot;
import org.beans.Person;
import org.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //구성 클래스(ProjectConfig)를 기반으로 스프링 컨텍스트 인스턴스를 생성함
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //스프링 켄텍스트에서 Person 빈의 참조를 얻음
        Person person = context.getBean(Person.class);
        //스프링 컨텍스트의 Person 빈인지 확인하려고 이름 출력
        System.out.println("Person's name : " + person.getName());
        //인스턴스 사아의 관계 여부 확인 - Person빈의 Parrot 출력함 => 사람과 앵무새의 관계가 아직 설정되지 않았음
        System.out.println("Person's parrot : " + person.getParrot());

    }
}










