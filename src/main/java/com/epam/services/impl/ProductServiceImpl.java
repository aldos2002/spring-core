package com.epam.services.impl;

import com.epam.services.ItemService;
import com.epam.services.ProductService;

/**
 * Created by Almas_Doskozhin
 * on 4/27/2016.
 */

public class ProductServiceImpl implements ProductService {
    private ItemService itemService;

    public ProductServiceImpl(ItemService itemService){
        this.itemService = itemService;
    }
}
