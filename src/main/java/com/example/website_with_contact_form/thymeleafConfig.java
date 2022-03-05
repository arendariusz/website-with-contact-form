package com.example.website_with_contact_form;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class thymeleafConfig {
    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}
