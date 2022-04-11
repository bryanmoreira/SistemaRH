package com.bryan.sistemaRH;

import java.util.Scanner;

public class Lider extends Funcionario {
	String partLucro;
	int quotasAcoes;
	
	public void cadastrarLider(Scanner entrada) {
		entrada.nextLine();
		
		System.out.println("Informe a participação nos lucros do funcionário:");
		partLucro = entrada.nextLine();
		
		System.out.println("Informe quanto em quotas o funcionário possui: ");
		quotasAcoes = entrada.nextInt();
	}

}
