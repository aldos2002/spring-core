package com.epam.services.impl;

import com.epam.services.ItemService;

/**
 * Created by Almas_Doskozhin
 * on 4/27/2016.
 */

public class ItemServiceImpl implements ItemService {
    private String itemName;
    private String itemUnit;

    public ItemServiceImpl(String itemName, String itemUnit) {
        this.itemName = itemName;
        this.itemUnit = itemUnit;
    }
}
