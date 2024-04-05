/*Exercicio 04: programa que solicita e trás algumas 
 * informacoes de agenda telefonica simples*/
package com.exercicesbasic04programeio.view;

import java.io.PrintStream;
import java.util.Scanner;

import com.exercicesbasic04programeio.util.Agenda;
import com.exercicesbasic04programeio.util.Contato;

public class MainAgenda {
	public static void main(String[] args) {
		PrintStream pst = System.out;
		Scanner input = new Scanner(System.in);
		
		pst.println("INFORME OS DADOS DA AGENDA");
		
		pst.print("DESCRICAO: ");
		String descricao = input.nextLine();
		
		pst.print("TIPO: ");
		String tipo = input.nextLine();
		
		pst.print("DD: ");
		int dd = input.nextInt();
		
		pst.print("NUMERO: ");
		input.nextLine();
		String numero = input.nextLine();
				
		Agenda agenda = new Agenda(descricao);
		agenda.agendaPrinter();
		
		Contato contato = new Contato(tipo, dd, numero);
		contato.contatoPrinter();
		
		input.close();
	}

}
