package com.pks.legservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties(prefix = "db")
public class LegConfig {

    private String url;
    private String username;
    private String password;
}
