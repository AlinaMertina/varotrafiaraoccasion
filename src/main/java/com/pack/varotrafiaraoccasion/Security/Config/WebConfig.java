package com.pack.varotrafiaraoccasion.Security.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Autoriser toutes les URL
                .allowedOrigins("http://localhost:8100") // Autoriser toutes les origines (à ajuster selon vos besoins)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Méthodes autorisées
                .allowedHeaders("Origin", "X-Requested-With", "Content-Type", "Accept"); // En-têtes autorisés
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/images/**")  // Le chemin d'accès URL pour les images
            .addResourceLocations("classpath:/static/images/");  // L'emplacement réel des images dans votre projet
    }
}

