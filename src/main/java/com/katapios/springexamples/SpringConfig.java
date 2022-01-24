package com.katapios.springexamples;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.katapios.springexamples")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
