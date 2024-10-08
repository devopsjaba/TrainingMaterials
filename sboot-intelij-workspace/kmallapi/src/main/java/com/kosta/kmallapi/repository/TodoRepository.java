package com.kosta.kmallapi.repository;

import com.kosta.kmallapi.domain.Todo;
import com.kosta.kmallapi.repository.search.TodoSearch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>, TodoSearch {
}
