package com.unicamp.mc322.projeto.utils;

import com.unicamp.mc322.projeto.constants.Effects;

public final class RandomEffect {

public static Effects getRandomTrace() {
		
		int enumEffectsSize = Effects.values().length;
		int index = (int)Math.floor(Math.random()*(enumEffectsSize));
		
		return Effects.values()[index];
	}
}
