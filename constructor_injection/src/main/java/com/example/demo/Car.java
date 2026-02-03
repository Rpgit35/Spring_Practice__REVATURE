package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private final Engine engine;
	
	public Car(Engine engine) {//spring injection
		this.engine=engine;
	}
	
	public String drive() {
		return engine.start()+"and car is moving";
	}

}
