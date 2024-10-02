package com.kosta.kmallapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;
    @Column(length = 500, nullable = false)
    private String title;
    private String content;
    private boolean complete;
    private LocalDate dueDate;

    public void changeTitle(String title) {
        this.title = title;
    }

    public void changeContent(String content) {
        this.content = content;
    }

    public void changeComplete(boolean complete) {
        this.complete = complete;
    }

    public void changeDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}

/*
    @Id : 해당 필드가 테이블의 기본키(PK) 역할을 한다는 것을 나타냄
    @GeneratedValue
        : 기본 키 필드의 값을 자동으로 생성하도록 지정
          strategy = GenerationType.IDENTITY  <-- 데이터베이스가 기본 키 생성을 관리하도록 지시함
                                                  데이터베이스에 레코드가 삽입될 때, 데이터베이스에서 자동으로
                                                  증가하는 숫자 값을 할당받음
 */