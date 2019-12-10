package com.orangeteam.auc.models;

import com.orangeteam.auc.models.Attribute;

import javax.persistence.*;

@Entity
@Table(name = "RESTRICTION")
public class Restrictions {
    // Идентификатор
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    // Атрибут, которому принадлежат ограничения на числовое значение
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATTRIBUTE_ID")
    private Attribute attribute;
    // Минимальное значение
    @Column(name = "MINVALUE", nullable = false)
    private double minValue;
    // Шаг значения
    @Column(name = "STEP", nullable = false)
    private double step;
    // Максимальное значение
    @Column(name = "MAXVALUE", nullable = false)
    private double maxValue;

    public Restrictions(Attribute attribute, double minValue, double step, double maxValue) {
        this.attribute = attribute;
        this.minValue = minValue;
        this.step = step;
        this.maxValue = maxValue;
    }

    public Restrictions() {
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

    public double getMinValue() {
        return minValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }
}
