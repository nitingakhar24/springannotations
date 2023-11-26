package com.example.springannotations.propertysource.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mail.properties")
@PropertySource("classpath:messages.properties")
public class ApplicationConfig {
}
