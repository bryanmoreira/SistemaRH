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
		
		System.out.println("Informe o nome do funcionário: ");
		nome = entrada.nextLine();
		
		System.out.println("Informe o endereço do funcionário: ");
		endereco = entrada.nextLine();
		
		System.out.println("Informe o telefone do funcionário: ");
		telefone = entrada.nextLine();
		
		System.out.println("Informe a data de admissão do funcionário: ");
		admissao = entrada.nextLine();
		
		System.out.println("Informe o cargo do funcionário: ");
		cargo = entrada.nextLine();
		
		System.out.println("Informe o salário inicial do funcionário: ");
		salarioInic = entrada.nextFloat();
		
	}

}
