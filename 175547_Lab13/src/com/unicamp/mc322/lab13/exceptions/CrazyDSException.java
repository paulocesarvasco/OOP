package com.unicamp.mc322.lab13.exceptions;

public class CrazyDSException extends IllegalArgumentException {

	public CrazyDSException(int index, int maxIndex) {
		super();
		System.out.printf("Index %d out of bound (%d)\n", index, maxIndex);
	}
}
