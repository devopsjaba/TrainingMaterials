package org.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "org.kosta")  /* basePackages 속성으로 스프링에 스테레타타입 애너테이션이 지정된
                                                클래스를 찾을 위치를 알려줌 */
public class ProjectConfig {
}
