package com.bryan.sistemaRH;

import java.util.Scanner;

public class Funcionario {
	String nome;
	String endereco;
	String telefone;
	String admissao;
	String cargo;
	float salarioInic;
	String date;
	
	public void CadastrarFuncionario(Scanner entrada) {
		
		entrada.nextLine();
		
		System.out.println("Informe o nome do funcion�rio: ");
		nome = entrada.nextLine();
		
		System.out.println("Informe o endere�o do funcion�rio: ");
		endereco = entrada.nextLine();
		
		System.out.println("Informe o telefone do funcion�rio: ");
		telefone = entrada.nextLine();
		
		System.out.println("Informe a data de admiss�o do funcion�rio: ");
		admissao = entrada.nextLine();
		
		System.out.println("Informe o cargo do funcion�rio: ");
		cargo = entrada.nextLine();
		
		System.out.println("Informe o sal�rio inicial do funcion�rio: ");
		salarioInic = entrada.nextFloat();
		
	}

}
