package com.ig.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ig.customer.Customer;
@Configuration
public class Springconfig {
	@Bean
	//@Scope("prototype")
	public Customer customer() {
		return new Customer();
		//return new Customer("ram","ram@gmail.com");
	}
}