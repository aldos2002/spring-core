package com.epam;

import com.epam.services.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The Product Initializer util class.
 */
@Component
public final class ProductInitializer {
    
     private ProductServiceImpl productService;

    @Autowired
    public ProductInitializer(ProductServiceImpl productService) {
        super();
        this.productService = productService;
    }
}
