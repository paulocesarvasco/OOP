package com.unicamp.mc322.lab05;

import java.util.Calendar;

public class Semanal extends Comum {

	protected Calendar dia;

	public Semanal(String descricao, Calendar dia) {
		super(descricao);
		this.dia = dia;
	}

}
