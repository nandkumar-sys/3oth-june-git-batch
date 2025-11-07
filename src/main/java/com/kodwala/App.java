package com.kodwala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodwala.bean.OrderItem;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		OrderItem orderItem = context.getBean(OrderItem.class);
		System.out.println("Order ID: " + orderItem.getId());
	}
}
