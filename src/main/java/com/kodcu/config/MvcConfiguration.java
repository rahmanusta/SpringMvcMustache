package com.kodcu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.mustache.MustacheTemplateLoader;
import org.springframework.web.servlet.view.mustache.MustacheViewResolver;

@Configuration
@ComponentScan(basePackages = "com.kodcu")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver getViewResolver(ResourceLoader resourceLoader) {
        MustacheViewResolver mustacheViewResolver = new MustacheViewResolver();
        mustacheViewResolver.setPrefix("/WEB-INF/views/");
        mustacheViewResolver.setSuffix(".html");
        mustacheViewResolver.setCache(false);
        mustacheViewResolver.setContentType("text/html;charset=utf-8");

        MustacheTemplateLoader mustacheTemplateLoader = new MustacheTemplateLoader();
        mustacheTemplateLoader.setResourceLoader(resourceLoader);

        mustacheViewResolver.setTemplateLoader(mustacheTemplateLoader);
        return mustacheViewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

}
