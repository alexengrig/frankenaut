package dev.alexengrig.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NameEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public NameEntity(String name) {
        this.name = name;
    }

    public NameEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
