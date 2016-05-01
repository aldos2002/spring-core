package com.epam.repositories.impl;

import com.epam.repositories.OrderRepository;


/**
 * Created by Almas_Doskozhin on 4/27/2016.
 */

public class OrderRepositoryImpl implements OrderRepository{
    private String sequentialId;
    public void setSequentialId(String sequentialId) {
        this.sequentialId = sequentialId;
    }

    public String getSequentialId() {
        return sequentialId;
    }
}
