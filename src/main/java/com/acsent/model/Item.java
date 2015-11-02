package com.acsent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {

    @Id
    private Long id;

    @Column(length = 100)
    private String name;

    //@Column(name="category_id")
    //private Category category;

    public Item(Long id, String name) {
        this.id       = id;
        this.name     = name;
    }

    public Item(Long id, String name, Category category) {
        this.id       = id;
        this.name     = name;
        //this.category = category;
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

//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
}
