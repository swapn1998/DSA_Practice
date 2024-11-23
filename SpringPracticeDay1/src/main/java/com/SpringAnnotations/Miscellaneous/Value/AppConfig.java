package com.SpringAnnotations.Miscellaneous.Value;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.SpringAnnotations.Miscellaneous")
@PropertySource("d1.properties")
public class AppConfig {


}
