package com.kodilla.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanLifecycleApplication {

		public static void main(String[] args) {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.register(AppConfiguration.class);
			context.refresh();

			LibraryManager manager = context.getBean(LibraryManager.class);
			SampleBean sampleBean = context.getBean(SampleBean.class);
			System.out.println("Context and beans are set up and ready to work");
			context.close();
		}


	}