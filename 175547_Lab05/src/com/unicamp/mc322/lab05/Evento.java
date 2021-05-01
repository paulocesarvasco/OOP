package com.unicamp.mc322.lab05;

import java.util.Calendar;

public class Evento extends Comum {

	protected Calendar data;
	
	public Evento(String descricao, Calendar data) {
		super(descricao);
		this.data = data;
	}

}
