package com.orangeteam.auc.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "POOL")
public class Pool {
    // Идентификатор
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    // Ссылка на атрибут, которому принадлежит это значение
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATTRIBUTE_ID")
    private Attribute attribute;
    // Само значение в виде строки
    @Column(name = "VALUE", nullable = false)
    private String value;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ATTRIBUTE_VALUE_ID")
    private Set<Product_Attribute_Value> product_attribute_values;

    public Pool(Attribute attribute, String value) {
        this.attribute = attribute;
        this.value = value;
    }

    public Pool() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Set<Product_Attribute_Value> getProduct_attribute_values() {
        return product_attribute_values;
    }

    public void setProduct_attribute_values(Set<Product_Attribute_Value> product_attribute_values) {
        this.product_attribute_values = product_attribute_values;
    }
}
