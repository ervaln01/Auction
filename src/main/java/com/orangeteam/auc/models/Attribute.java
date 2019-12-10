package com.orangeteam.auc.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ATTRIBUTE")
public class Attribute {
    // Идентификатор атрибута
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    // Название атрибута
    @Column(name = "NAME", nullable = false)
    private String name;
    // Тип (дискретный/непрерывный
    @Column(name = "TYPE", nullable = false)
    private int type;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "POOL_ID")
    private Set<Pool> pools;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESTRICTIONS_ID")
    private Restrictions restrictions;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ATTRIBUTE_CATEGORY",
        joinColumns = @JoinColumn(name = "ATTRIBUTE_ID"),
        inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID"))
    private Set<Category> categories;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ATTRIBUTE_VALUE_ID")
    private Set<Product_Attribute_Value> product_attribute_values;

    public Attribute(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public Attribute() {
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Set<Pool> getPools() {
        return pools;
    }

    public void setPools(Set<Pool> pools) {
        this.pools = pools;
    }

    public Restrictions getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<Product_Attribute_Value> getProduct_attribute_values() {
        return product_attribute_values;
    }

    public void setProduct_attribute_values(Set<Product_Attribute_Value> product_attribute_values) {
        this.product_attribute_values = product_attribute_values;
    }
}
