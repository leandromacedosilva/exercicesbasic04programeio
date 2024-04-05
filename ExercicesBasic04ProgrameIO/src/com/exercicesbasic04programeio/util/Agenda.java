package com.exercicesbasic04programeio.util;

public class Agenda {
	
	private String descricao;
	
	public Agenda() {}

	public Agenda(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public void agendaPrinter() {
		System.out.println("=============================================");
		System.out.println("INFORMACOES DA AGENDA TELEFONICA");
		System.out.println("DESCRICAO: " + this.descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Agenda [descricao=" + descricao + "]";
	}
	
}
