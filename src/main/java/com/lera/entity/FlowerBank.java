package com.lera.entity;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by panser on 5/10/14.
 */
@Entity
@Table(name = "flowerbanks")
public class FlowerBank {
    @Id
    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @org.hibernate.annotations.Parameter(name = "property", value = "flower"))
    @GeneratedValue(generator = "generator")
    private Integer id;

    private Integer count;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Flower flower;

    public FlowerBank() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


}
