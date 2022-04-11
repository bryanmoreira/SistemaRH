package com.bryan.sistemaRH;

import java.util.Scanner;

public class TesteProjeto {

	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		Funcionario colaborador = new Funcionario();
		Lider gerente = new Lider();
		
		System.out.println("Escolha uma das op��es: ");
		System.out.println("1 - Cadastrar funcion�rio");
		System.out.println("2 - Cadastrar funcion�rio que possui quotas e participa��o nos lucros");
		
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Cadastrando funcion�rio");
			colaborador.CadastrarFuncionario(entrada);
			System.out.println("Nome: " + colaborador.nome);
			System.out.println("Endere�o: " + colaborador.endereco);
			System.out.println("Telefone: " + colaborador.telefone);
			System.out.println("Admiss�o: " + colaborador.admissao);
			System.out.println("Cargo: " + colaborador.cargo);
			System.out.println("Sal�rio Inicial: " + colaborador.salarioInic);
		break;
		case 2:
			System.out.println("Cadastrando funcion�rio que possui quotas e participa��o nos lucros");
			gerente.CadastrarFuncionario(entrada);
			gerente.cadastrarLider(entrada);
			System.out.println("Nome: " + gerente.nome);
			System.out.println("Endere�o: " + gerente.endereco);
			System.out.println("Telefone: " + gerente.telefone);
			System.out.println("Admiss�o: " + gerente.admissao);
			System.out.println("Cargo: " + gerente.cargo);
			System.out.println("Sal�rio Inicial: " + gerente.salarioInic);
			System.out.println("Participa��o nos lucros: " + gerente.partLucro);
			System.out.println("Quotas de A��es: " + gerente.quotasAcoes);
		break;
		}

	}
}