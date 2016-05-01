package com.epam;

import com.epam.services.ItemService;
import com.epam.services.OrderService;
import com.epam.services.ProductService;
import com.epam.services.UserService;
import com.epam.services.impl.OrderServiceImpl;
import com.epam.services.impl.ProductServiceImpl;
import com.epam.services.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ShopLauncher {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ProductService productService = (ProductServiceImpl) context.getBean("productService");
        OrderService orderService = context.getBean(OrderServiceImpl.class);
        ItemService itemService = context.getBean("itemService", ItemService.class);
        UserService userService = (UserServiceImpl) context.getBean("aliasService");

        System.out.println(productService.toString());
        System.out.println(orderService.toString());
        System.out.println(itemService.toString());
        System.out.println(userService.toString());
    }
}
