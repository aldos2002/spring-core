package com.epam.repositories.factory;

import com.epam.repositories.OrderRepository;
import com.epam.repositories.impl.OrderRepositoryImpl;

/**
 * Created by Almas_Doskozhin
 * on 4/29/2016.
 */
public class OrderRepositoryFactory {
    private String sequentialId;
    public void setSequentialId(String sequentialId) {
        this.sequentialId = sequentialId;
    }

    public String getSequentialId() {
        return sequentialId;
    }

    public OrderRepository createOrderRepository() {
        OrderRepository repository = new OrderRepositoryImpl();
        repository.setSequentialId(sequentialId);
        return repository;
    }}
