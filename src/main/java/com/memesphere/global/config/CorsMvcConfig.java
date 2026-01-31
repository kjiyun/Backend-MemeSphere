package com.memesphere.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")
                .allowedOrigins("http://localhost:3000", "http://54.180.103.148", "http://frontend-memesphere.netlify.app/",
                        "https://frontend-memesphere.netlify.app/", "https://www.memesphere.site/",
                        "http://api.memesphere.site", "https://api.memesphere.site");
    }
}
