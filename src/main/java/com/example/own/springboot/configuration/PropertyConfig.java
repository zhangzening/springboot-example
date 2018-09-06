package com.example.own.springboot.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author zaney
 * @describe
 * @since 2018/9/6
 **/
@ConfigurationProperties(prefix = "custom")
@PropertySource("classpath:custom-application.yml")
//@Configuration
@Component
//@Data
public class PropertyConfig {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
