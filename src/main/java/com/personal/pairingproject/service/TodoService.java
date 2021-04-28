package com.personal.pairingproject.service;

import com.personal.pairingproject.model.TodoNew;
import com.personal.pairingproject.persistence.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor

public class TodoService {
    private final TodoRepository todoRepository;
    public boolean addTodo(String todo) {
        // So here's where the issue is, I'm using this out of the box builder fn to save but its saving the entire request string!
        todoRepository.save(TodoNew.builder().text(todo).build());
        return true;
    }
    public List<TodoNew> allTodos() {
        return todoRepository.findAll();
    }
}
