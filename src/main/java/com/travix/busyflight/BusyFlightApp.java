package com.travix.busyflight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = {"com.travix"})
@SpringBootApplication
@EnableWebMvc
@EnableAutoConfiguration
@EnableAspectJAutoProxy(proxyTargetClass=true)
//@PropertySource(value = "bookup-rest.properties")
public class BusyFlightApp {
	public static void main(String[] args) {
		SpringApplication.run(BusyFlightApp.class, args);
	}
}
