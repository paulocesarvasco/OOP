package com.unicamp.mc322.lab05;

import java.time.Month;

public class Mensal extends Comum {

	protected Month mes;

	public Mensal(String descricao, Month mes) {
		super(descricao);
		this.mes = mes;
	}

}
