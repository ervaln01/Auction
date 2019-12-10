package com.orangeteam.auc.models;

import javax.persistence.*;

@Entity
@Table(name = "NOTIFICATIONS")
public class Notifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    @Column(name = "TYPE", nullable = false)
    private int type;
    @Column(name = "TEXT", nullable = false)
    private String text;

    public Notifications(User user, int type, String text) {
        this.user = user;
        this.type = type;
        this.text = text;
    }

    public Notifications() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
