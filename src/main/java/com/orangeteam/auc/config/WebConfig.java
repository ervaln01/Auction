package com.orangeteam.auc.config;

import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/templates/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/templates/js/");
        registry.addResourceHandler("/font.roboto/**").addResourceLocations("classpath:/templates/font.roboto/");
        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/templates/img/");
        registry.addResourceHandler("/srcc/**").addResourceLocations("classpath:/templates/srcc");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("", ".html");
    }


}
