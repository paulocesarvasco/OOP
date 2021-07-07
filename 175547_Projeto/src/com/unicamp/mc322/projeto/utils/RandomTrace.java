package com.unicamp.mc322.projeto.utils;

import com.unicamp.mc322.projeto.constants.Traces;

public final class RandomTrace {

	public static Traces getRandomTrace() {
		
		int enumTraceSize = Traces.values().length;
		int index = (int)Math.floor(Math.random()*(enumTraceSize));
		
		return Traces.values()[index];
	}
}
