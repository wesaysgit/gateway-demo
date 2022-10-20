package com.example.fallback;


import com.example.pojo.Product;
import com.example.service.ProductService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 服务熔断降级处理可以捕获异常
 */
@Component
@Slf4j
public class ProductServiceFallbackFactory implements FallbackFactory<ProductService> {

	@Override
	public ProductService create(Throwable cause) {
		return id -> {
			log.info("product-service 服务 selectProductById 方法出现异常，异常信息如下：");
			return new Product(id, "托底数据", 2, 6666D);
		};
	}
}