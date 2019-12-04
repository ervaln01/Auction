package com.orangeteam.auc.models;

import org.hibernate.mapping.FetchProfile;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "STARTPRICE", nullable = false)
    private double startPrice;
    @Column(name = "STEP", nullable = false)
    private double step;
    @Column(name = "CURRPRICE", nullable = false)
    private double currprice;
    @Column(name = "DESCRIPTION", nullable = true)
    private String description;
    @Column(name = "STATE", nullable = false)
    private int state;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATEBEG", nullable = false)
    private Date dateBeg;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATEEND", nullable = false)
    private Date dateEnd;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "CATEGORY_PRODUCT",
            joinColumns = @JoinColumn(name = "PRODUCT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID"))
    private Set<Category> categories;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "VALUE_ID")
    private Set<Value> values;

    public Product(){super();}

    public Product(String name, double startPrice, double step, double currprice, String description, int state, Date dateBeg, Date dateEnd, Set<Category> categories) {
        this.name = name;
        this.startPrice = startPrice;
        this.step = step;
        this.currprice = currprice;
        this.description = description;
        this.state = state;
        this.dateBeg = dateBeg;
        this.dateEnd = dateEnd;
        this.categories = categories;
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

    public double getCurrprice() {
        return currprice;
    }

    public void setCurrprice(double currprice) {
        this.currprice = currprice;
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

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<Value> getValues() {
        return values;
    }

    public void setValues(Set<Value> values) {
        this.values = values;
    }
}
