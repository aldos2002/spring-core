package com.epam.services.impl;

import com.epam.services.ItemService;
import com.epam.services.OrderService;

import javax.annotation.Resource;

/**
 * Created by Almas_Doskozhin
 * on 4/27/2016.
 */

public class OrderServiceImpl implements OrderService{

    @Resource(name = "itemService")
    private ItemService itemService;
}
