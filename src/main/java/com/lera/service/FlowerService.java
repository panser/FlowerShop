package com.lera.service;

import com.lera.dao.FlowerDAO;
import com.lera.entity.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by panser on 5/11/14.
 */
@Service
@Transactional
public class FlowerService {
    @Autowired
    private FlowerDAO flowerDAO;

    @Transactional(rollbackFor = Exception.class)
    public Flower merge(Flower flower) {
        Flower flowerNew = flowerDAO.merge(flower);
        return flowerNew;
    }

}
