package com.bryan.sistemaRH;

import java.util.Scanner;

public class Lider extends Funcionario {
	String partLucro;
	int quotasAcoes;
	
	public void cadastrarLider(Scanner entrada) {
		entrada.nextLine();
		
		System.out.println("Informe a participa��o nos lucros do funcion�rio:");
		partLucro = entrada.nextLine();
		
		System.out.println("Informe quanto em quotas o funcion�rio possui: ");
		quotasAcoes = entrada.nextInt();
	}

}
