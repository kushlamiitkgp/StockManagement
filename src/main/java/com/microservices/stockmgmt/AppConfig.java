package com.microservices.stockmgmt;

import com.microservices.stockmgmt.rest.DefaultPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {DefaultPackage.class})
public class AppConfig {
}
