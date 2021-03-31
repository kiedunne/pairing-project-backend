package com.personal.pairingproject.persistence;

import com.personal.pairingproject.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoItem, Integer> {
    // SQL query in value
    @Query(value = "INSERT INTO Todo (text, completed, created_on) VALUES ('First todo', false, CURRENT_TIMESTAMP);", nativeQuery = true)
    void persistTodoItem();
}
