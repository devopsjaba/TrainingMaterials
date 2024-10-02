package com.kosta.kmallapi.repository;

import com.kosta.kmallapi.domain.Todo;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootTest
@Log4j2
public class TodoRepositoryTests {
    @Autowired
    private TodoRepository todoRepository;

    @Test
    public void test1() {
        Assertions.assertNotNull(todoRepository);
        log.info(todoRepository.getClass().getName());
    }

    @Test
    public void testInsert() {
       Todo todo =  Todo.builder()
               .title("Website contruction")
               .content("Web for profit automation")
               .dueDate(LocalDate.of(2024, 10, 15))
               .build();

       Todo result = todoRepository.save(todo);
       log.info(result.toString());
    }

    @Test
    public void testInsert2() {
        for (int i = 0; i < 100; i++) {
            Todo todo =  Todo.builder()
                    .title("Website contruction" +i)
                    .content("Web for profit automation" +i)
                    .dueDate(LocalDate.of(2024, 10, 15))
                    .build();

            Todo result = todoRepository.save(todo);
            log.info(result.toString());
        }

    }

    @Test
    public void testRead() {
        Long tno = 1L;
        Optional<Todo> result = todoRepository.findById(tno);
        Todo todo = result.orElseThrow();
        log.info(todo.toString());
    }

    @Test
    public void testUpdate() {
        Long tno = 1L;
        Optional<Todo> result = todoRepository.findById(tno);
        Todo todo = result.orElseThrow();

        todo.changeTitle("Update Website contruction");
        todo.changeContent("Update Web for profit automation");
        todo.changeComplete(true);
        todoRepository.save(todo);
        log.info(todo.toString());
    }

    @Test
    public void testPaging() {
        // 페이지 번호는 0부터
       Pageable pageable = PageRequest.of(0, 10, Sort.by("tno").descending());
       Page<Todo> result = todoRepository.findAll(pageable);
       log.info(result.getTotalElements());
       log.info(result.getContent());
    }
}






