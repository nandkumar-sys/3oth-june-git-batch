package com.kodwala.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderItem {
	@Value("100")
	private int id;

	public int getId() {

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
