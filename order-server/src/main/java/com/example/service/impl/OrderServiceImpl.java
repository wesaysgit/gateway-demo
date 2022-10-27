package com.example.service.impl;


import com.example.cache.OrderCache;
import com.example.pojo.Order;
import com.example.service.OrderService;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderCache orderCache;

	/**
	 * 根据主键查询订单
	 *
	 * @param id
	 * @return
	 */
	@Override
	public Order selectOrderById(Integer id) {
		return orderCache.selectOrderById(1);
	}
}