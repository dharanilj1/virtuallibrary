package com.library.virtual.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "library")
public class Library implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    @TableGenerator(name = "LIB_GEN", allocationSize = 1)
    @Id
    @GeneratedValue(generator = "LIB_GEN")
    private int id;

    private String name;

    @OneToMany(mappedBy="library" ,cascade= CascadeType.ALL , fetch = FetchType.LAZY)
    private Collection<Book> books =new ArrayList<Book>();





}
