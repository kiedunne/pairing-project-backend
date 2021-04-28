package com.personal.pairingproject.persistence;

import com.personal.pairingproject.model.TodoNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface TodoRepository extends JpaRepository<TodoNew, UUID> {
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO todo (id, text) values (:id, :text)", nativeQuery = true)
    void persistTodoItem(@Param("text") String text, @Param("id") UUID id);
}
