package com.lera.entity;

import com.lera.entity.notPersistence.Goods;
import com.lera.entity.notPersistence.Plant;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by panser on 5/10/14.
 */
@Entity
@Table(name = "flowers")
public class Flower extends Plant implements Goods, Serializable{
    protected Integer price;

    @OneToOne(mappedBy = "flower")
    private FlowerBank flowerBank;

    public FlowerBank getFlowerBank() {
        return flowerBank;
    }

    public void setFlowerBank(FlowerBank flowerBank) {
        this.flowerBank = flowerBank;
    }

    public void setPrice(Integer price) {
        if (price >= 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Not supported negative value");
    }

    public Integer getPrice() {
        return this.price;
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
