package com.lera.dao;

import com.lera.entity.Flower;
import com.lera.entity.FlowerBank;

import java.util.List;
import java.util.Set;

/**
 * Created by panser on 5/10/14.
 */
public interface FlowerBankDAO {
    FlowerBank find(Integer id);
    List<FlowerBank> findAll();
    FlowerBank merge(FlowerBank flowerBank);
    FlowerBank save(FlowerBank flowerBank);
    void delete(FlowerBank flowerBank);
}
