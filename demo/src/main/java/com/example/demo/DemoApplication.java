package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;


@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class DemoApplication {

	public static void main(String[] args) {

		{
			ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

			String[] beanNames = ctx.getBeanDefinitionNames();

			Arrays.sort(beanNames);

			for (String beanName : beanNames)
			{
				System.out.println(beanName);
			}
		}
	}
	}

