package com.lera.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by panser on 5/10/14.
 */
@Entity
@Table(name = "flowers")
public class Flower{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    protected Integer price;
    protected String name;

    @OneToOne(mappedBy = "flower")
    private FlowerBank flowerBank;

    public FlowerBank getFlowerBank() {
        return flowerBank;
    }

    public void setFlowerBank(FlowerBank flowerBank) {
        this.flowerBank = flowerBank;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flower() {
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
