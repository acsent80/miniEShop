package com.acsent.config;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {

    // can't find static resources without this class

}