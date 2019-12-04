package com.orangeteam.auc.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "ATTRIBUTE")
public class Attribute implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String Name;
    @Column(name = "LOCALNAME", nullable = false)
    private String LocalName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "VALUE_ID")
    private Set<Value> values;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "ATTRLIST_ATTRIBUTE",
            joinColumns = @JoinColumn(name = "ATTRIBUTE_ID"),
            inverseJoinColumns = @JoinColumn(name = "ATTRLIST_ID"))
    private Set<AttrList> lists;

    public Attribute(){super();}

    @Override
    public String toString() {
        return id + ": " + getName() + "; " + getLocalName();
    }

    public Attribute(String name, String localName) {
        Name = name;
        LocalName = localName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String localName) {
        LocalName = localName;
    }

    public Set<Value> getValues() {
        return values;
    }

    public void setValues(Set<Value> values) {
        this.values = values;
    }

    public Set<AttrList> getLists() {
        return lists;
    }

    public void setLists(Set<AttrList> lists) {
        this.lists = lists;
    }
}
