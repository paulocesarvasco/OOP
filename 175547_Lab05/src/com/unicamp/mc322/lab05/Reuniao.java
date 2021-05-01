package com.unicamp.mc322.lab05;

import java.util.ArrayList;
import java.util.List;

public class Reuniao extends Comum {

	private List<Contato> convidados = new ArrayList<Contato>();
	
	public Reuniao(String descricao, List<Contato> convidados) {
		super(descricao);
		this.convidados = convidados;
	}
	
	public Reuniao(String descricao, Contato convidado) {
		super(descricao);
		this.convidados.add(convidado);
	}
	
	public void adicionarConvidado(Contato convidado) {
		this.convidados.add(convidado);
	}
	
	public boolean removerConvidado(Contato convidado) {
		return this.convidados.remove(convidado);
	}
	
}
