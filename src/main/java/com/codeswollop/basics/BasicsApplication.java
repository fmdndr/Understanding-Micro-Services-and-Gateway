package com.codeswollop.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class BasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicsApplication.class, args);
    }


    @Bean
    RouteLocator gateway(RouteLocatorBuilder rlb) {
        return rlb
                .routes()
                .route(routeSpec -> routeSpec
                        .path("/hello").and().host("*.spring.io")
                        .and()
                        .asyncPredicate(serverWebExchange -> Mono.just(serverWebExchange.getAttribute("foo")))
                        .filters(gatewayFilterSpec -> gatewayFilterSpec
                                .setPath("/guides")
                        )
                        .uri("http://spring.io")
                )
                .route(routeSpec -> routeSpec
                        .path("/twitter/**")
                        .filters(fs -> fs.rewritePath(
                                "/twitter/(?<handle>.*)",
                                "/${handle}"
                        ))
                        .uri("http://twitter.com/@")
                )
                .build();
    }

}
