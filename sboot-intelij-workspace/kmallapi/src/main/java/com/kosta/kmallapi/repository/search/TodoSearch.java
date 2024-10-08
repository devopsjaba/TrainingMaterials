package com.kosta.kmallapi.repository.search;

import com.kosta.kmallapi.domain.Todo;
import org.springframework.data.domain.Page;

public interface TodoSearch {
    Page<Todo> search1();
}
