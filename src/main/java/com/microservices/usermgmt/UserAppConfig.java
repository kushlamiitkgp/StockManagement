package com.microservices.usermgmt;

import com.microservices.usermgmt.rest.DefaultPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {DefaultPackage.class})
public class UserAppConfig {
}
