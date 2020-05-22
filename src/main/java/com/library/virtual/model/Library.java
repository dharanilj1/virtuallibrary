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
@Table(name = "Library")
public class Library implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    @TableGenerator(name = "LIB_GEN", allocationSize = 1)
    @Id
    @GeneratedValue(generator = "LIB_GEN")
    private int id;

    private String name;

    @OneToMany(mappedBy="library" ,cascade= CascadeType.ALL , fetch = FetchType.LAZY)
    private Collection<Book> books =new ArrayList<Book>();





}
