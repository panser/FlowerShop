package com.lera.entity;

import com.lera.entity.notEntity.Plant;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by panser on 5/10/14.
 */
@Entity
@Table(name = "flowers")
public class Flower extends Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    protected Integer price;

    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "flowerBankId", referencedColumnName = "id")
    private FlowerBank flowerBank;

//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "resumeId", fetch = FetchType.LAZY)
//    private Set<WorkExpEntity> workExpCollection = new HashSet<>();

    public void setPrice(Integer price) {
        if (price >= 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Not supported negative value");
    }

    public Integer getPrice() {
        return this.price;
    }

    public Flower(String name, Integer price){
        setName(name);
        setPrice(price);
    }

    public Flower() {
    }
}
