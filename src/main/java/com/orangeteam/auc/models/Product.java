package com.orangeteam.auc.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "STAERTPRICE", nullable = false)
    private double startPrice;
    @Column(name = "STEP", nullable = false)
    private double step;
    @Column(name = "CURRPRICE", nullable = false)
    private double currPrice;
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
    @Column(name = "STATE", nullable = true)
    private int state;
    @Column(name = "DATEBEG", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dateBeg;
    @Column(name = "DATEEND", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dateEnd;
    @Column(name = "IMAGES", nullable = false)
    private String images;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "CATEGORY_PRODUCT",
            joinColumns = @JoinColumn(name = "PRODUCT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID"))
    private Set<Category> categories;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ATTRIBUTE_VALUE_ID")
    private Set<Product_Attribute_Value> product_attribute_values;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "LISTS_ID")
    private Set<Lists> lists;

    public Product(String name, double startPrice, double step, double currPrice, String description, int state, Date dateBeg, Date dateEnd, String images, Set<Category> categories, Set<Product_Attribute_Value> product_attribute_values) {
        this.name = name;
        this.startPrice = startPrice;
        this.step = step;
        this.currPrice = currPrice;
        this.description = description;
        this.state = state;
        this.dateBeg = dateBeg;
        this.dateEnd = dateEnd;
        this.images = images;
        this.categories = categories;
        this.product_attribute_values = product_attribute_values;
    }

    public Product() {
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

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(double currPrice) {
        this.currPrice = currPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getDateBeg() {
        return dateBeg;
    }

    public void setDateBeg(Date dateBeg) {
        this.dateBeg = dateBeg;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
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

    public Set<Lists> getLists() {
        return lists;
    }

    public void setLists(Set<Lists> lists) {
        this.lists = lists;
    }
}
