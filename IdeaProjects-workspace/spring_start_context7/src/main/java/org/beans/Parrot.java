package org.beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "러브버드";

    public Parrot() {
        System.out.println("Parrot 생성됨");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}


