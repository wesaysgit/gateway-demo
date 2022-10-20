package com.example.service.impl;


import com.example.pojo.Product;
import com.example.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * 商品服务
 */
@Service
public class ProductServiceImpl implements ProductService {


	/**
	 * 根据主键查询商品
	 *
	 * @param id
	 * @return
	 */
	@Override
	public Product selectProductById(Integer id) {
		return new Product(id, "冰箱", 1, 2666D);
	}
}