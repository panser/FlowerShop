package com.lera.dao;

import com.lera.entity.Flower;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by panser on 5/11/14.
 */
@Repository
public class FlowerImplHibernate implements FlowerDAO {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public Flower merge(Flower flower) {
        Flower flowerNew = (Flower)sessionFactory.getCurrentSession().merge(flower);
        return flowerNew;
    }
}
