package com.unicamp.mc322.lab13.exceptions;

public class CreateOrderException extends IllegalArgumentException {

	public CreateOrderException(String msg) {
		System.out.println(msg);
	}
}
