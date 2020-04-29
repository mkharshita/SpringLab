package com.cg.labbook1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.cg.labbook1")
@PropertySource("classpath:info.properties")
public class JavaConfig {

}
