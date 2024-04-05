package com.exercicesbasic04programeio.util;

public class Contato {
	
	private String tipo;
	private int dd;
	private String numero;
	
	public Contato() {}

	public Contato(String tipo, int dd, String numero) {
		super();
		this.tipo = tipo;
		this.dd = dd;
		this.numero = numero;
	}
	
	public void contatoPrinter() {
		//System.out.println("=============================================");
		System.out.println("TIPO: " + this.tipo);
		System.out.println("DD: " + this.dd);
		System.out.println("NUMERO: " + this.numero);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Contato [tipo=" + tipo + ", dd=" + dd + ", numero=" + numero + "]";
	}
	
}
