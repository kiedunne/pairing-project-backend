package com.personal.pairingproject.controller;

import com.personal.pairingproject.model.TodoNew;
import com.personal.pairingproject.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class MainController {

    private final TodoService todoService;

    @CrossOrigin("*")
    @GetMapping(value = "health-check")
    public String healthCheck() {
        log.info("health check hit");
        return "OK";
    }

    @CrossOrigin("*")
    @GetMapping(value = "all-todos")
    public List<TodoNew> allTodos() throws Exception {
        List<TodoNew> hasBeenFetched = todoService.allTodos();

        log.info("All todos fetched");
        return hasBeenFetched;
    }

    @CrossOrigin("*")
    @PostMapping(value = "send-todo")
    public String sendTodo(@RequestBody() String todo) throws Exception {

        boolean hasBeenAdded = todoService.addTodo(todo);
        if (!hasBeenAdded) {
            throw new Exception("Todo not added!");
        }

        log.info(todo);
        return todo;
    }
}
