package com.example.cache;

import com.alicp.jetcache.anno.Cached;
import com.example.constant.CacheConstants;
import com.example.pojo.Order;
import com.example.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
@Slf4j
public class OrderCache {

    @Autowired
    private ProductService productService;

    @Cached(name = CacheConstants.ORDER_NAME, key = "#id", expire = 60 * 3)
    public Order selectOrderById(Integer id) {
        log.warn("--------------------order cache select--------------------");
        return new Order(id, "order-001", "中国", 2666D,
                Collections.singletonList(productService.selectProductById(id)));
    }
}
