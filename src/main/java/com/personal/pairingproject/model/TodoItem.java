package com.personal.pairingproject.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class TodoItem {
    public int id;
    public String text;
    public boolean completed;
}
