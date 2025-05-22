package com.redonion.tcg.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("DEBUG: Configuring resource handlers");
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
        System.out.println("DEBUG: Resource handlers configured");
    }
}