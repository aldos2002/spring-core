package com.epam;

import com.epam.services.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {
    private ProductInitializer productInitializer;
    @Autowired
    private ProductServiceImpl productService;

    @PostConstruct
    public void initData() {
        productInitializer = new ProductInitializer(productService);
    }
}
