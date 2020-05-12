package com.cleverds.controller.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:8090")
                        .allowedMethods("PUT", "DELETE", "GET", "POST")
                        .allowedHeaders("Content-type")
                        .allowedHeaders("Access-Control-Allow-Origin")
                        .allowCredentials(false).maxAge(3600);
            }
        };
    }
}
