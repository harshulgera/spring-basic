package com.gera.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan({"com.gera.controllers"})
public class WebAppConfig  implements WebMvcConfigurer {

    public WebAppConfig()
    {

    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/views/");
        vr.setSuffix(".jsp");
        vr.setExposeContextBeansAsAttributes(true);
        return vr;
    }

//    @Bean(name = {"multipartResolver"})
//    public CommonsMultipartResolver multipartResolver() {
//        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
//        multipartResolver.setMaxUploadSize(10000000L);
//        return multipartResolver;
//    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(new String[]{"/resources/**"}).addResourceLocations(new String[]{"/resources/"});
    }





}



