package com.personal.pairingproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
public class TodoNew {
    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    public UUID id;
    public String text;
    public boolean completed;

    public TodoNew(){}

    public UUID getId() {
        return id;
    }
    public String getText() {
        return text;
    }
    public boolean getCompleted() {
        return completed;
    }
}
