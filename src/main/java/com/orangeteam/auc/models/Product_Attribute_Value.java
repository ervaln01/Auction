package com.orangeteam.auc.models;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_ATTRIBUTE_VALUE")
public class Product_Attribute_Value {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATTRIBUTE_ID")
    private Attribute attribute;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POOL_ID")
    private Pool pool;

    @Column(name = "NUMBVALUE", nullable = true)
    private double numbValue;

    public Product_Attribute_Value(Product product, Attribute attribute, Pool pool, double numbValue) {
        this.product = product;
        this.attribute = attribute;
        this.pool = pool;
        this.numbValue = numbValue;
    }

    public Product_Attribute_Value() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public double getNumbValue() {
        return numbValue;
    }

    public void setNumbValue(double numbValue) {
        this.numbValue = numbValue;
    }
}
