package com.bryan.sistemaRH;

import java.util.Scanner;

public class TesteProjeto {

	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		Funcionario colaborador = new Funcionario();
		Lider gerente = new Lider();
		
		System.out.println("Escolha uma das opções: ");
		System.out.println("1 - Cadastrar funcionário");
		System.out.println("2 - Cadastrar funcionário que possui quotas e participação nos lucros");
		
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Cadastrando funcionário");
			colaborador.CadastrarFuncionario(entrada);
			System.out.println("Nome: " + colaborador.nome);
			System.out.println("Endereço: " + colaborador.endereco);
			System.out.println("Telefone: " + colaborador.telefone);
			System.out.println("Admissão: " + colaborador.admissao);
			System.out.println("Cargo: " + colaborador.cargo);
			System.out.println("Salário Inicial: " + colaborador.salarioInic);
		break;
		case 2:
			System.out.println("Cadastrando funcionário que possui quotas e participação nos lucros");
			gerente.CadastrarFuncionario(entrada);
			gerente.cadastrarLider(entrada);
			System.out.println("Nome: " + gerente.nome);
			System.out.println("Endereço: " + gerente.endereco);
			System.out.println("Telefone: " + gerente.telefone);
			System.out.println("Admissão: " + gerente.admissao);
			System.out.println("Cargo: " + gerente.cargo);
			System.out.println("Salário Inicial: " + gerente.salarioInic);
			System.out.println("Participação nos lucros: " + gerente.partLucro);
			System.out.println("Quotas de Ações: " + gerente.quotasAcoes);
		break;
		}

	}
}