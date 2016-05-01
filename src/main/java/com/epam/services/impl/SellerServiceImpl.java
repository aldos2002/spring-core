package com.epam.services.impl;

import com.epam.services.ItemService;
import com.epam.services.OrderService;

/**
 * Created by Almas_Doskozhin
 * on 4/27/2016.
 */

public class SellerServiceImpl implements OrderService {
    private ItemService itemService;

    public ItemService getItemService() {
        return itemService;
    }

    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }
}
