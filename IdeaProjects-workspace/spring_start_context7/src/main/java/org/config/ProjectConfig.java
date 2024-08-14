package org.config;

import org.beans.Parrot;
import org.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.beans")
public class ProjectConfig {

}
