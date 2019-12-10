package com.orangeteam.auc.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CATEGORY")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category parent;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Set<Category> subsidiary;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ATTRIBUTE_CATEGORY",
            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ATTRIBUTE_ID"))
    private Set<Attribute> attributes;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "CATEGORY_PRODUCT",
            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID"))
    private Set<Product> products;

    public Category(String name, Category parent, Set<Attribute> attributes) {
        this.name = name;
        this.parent = parent;
        this.attributes = attributes;
    }

    public Category() {
        super();
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

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public Set<Category> getSubsidiary() {
        return subsidiary;
    }

    public void setSubsidiary(Set<Category> subsidiary) {
        this.subsidiary = subsidiary;
    }

    public Set<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(Set<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
