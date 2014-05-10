package com.lera.entity;

import javax.persistence.*;

/**
 * Created by panser on 5/10/14.
 */
@Entity
@Table(name = "flowerbanks")
public class FlowerBank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "flowerId", referencedColumnName = "id")
    private Flower flower;
    private Integer count;

    public FlowerBank() {
    }

    public FlowerBank(Flower flower, Integer count) {
        this.flower = flower;
        this.count = count;
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
