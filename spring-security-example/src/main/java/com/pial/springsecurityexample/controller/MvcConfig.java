package com.pial.springsecurityexample.controller;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/show").setViewName("show");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/create").setViewName("create");
        registry.addViewController("/edit").setViewName("edit");
        registry.addViewController("/delete").setViewName("delete");
        registry.addViewController("/comment").setViewName("comment");
        registry.addViewController("/reaction").setViewName("reaction");
    }
}
