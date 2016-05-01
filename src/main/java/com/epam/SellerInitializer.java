package com.epam;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

@Component
public class SellerInitializer {

    @Resource(name = "sellersMap")
    private Map<Long, String> sellerNames;

    public Map<Long, String> getSellerNames() {
        return sellerNames;
    }

    public void setSellerNames(Map<Long, String> sellerNames) {
        this.sellerNames = sellerNames;
    }
}
