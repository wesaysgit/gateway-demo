package com.example.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Slf4j
public class CustomGatewayFilter implements GatewayFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("\"自定义网关过滤器\" = " + "自定义网关过滤器");
        log.info("\"自定义网关过滤器\" = " + "自定义网关过滤器");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
