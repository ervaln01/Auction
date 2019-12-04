package com.orangeteam.auc.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "ATTRLIST")
public class AttrList implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "CATEGORY_ID")
    private Set<Category> categories;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ATTRLIST_ID")
    private AttrList parent;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "ATTRLIST_ATTRIBUTE",
        joinColumns = @JoinColumn(name = "ATTRLIST_ID"),
        inverseJoinColumns = @JoinColumn(name = "ATTRIBUTE_ID"))
    private Set<Attribute> attributes;

    public AttrList(){super();}

    public AttrList(String name, AttrList parent, Set<Attribute> attributes) {
        this.name = name;
        this.parent = parent;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        String result = "";
        AttrList pr = parent;
        while(pr!=null){
            result += pr.name + "->";
            pr = pr.parent;
        }
        return id + ": " + name + "; " + result;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public AttrList getParent() {
        return parent;
    }

    public void setParent(AttrList parent) {
        this.parent = parent;
    }

    public Set<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Set<Attribute> attributes) {
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
