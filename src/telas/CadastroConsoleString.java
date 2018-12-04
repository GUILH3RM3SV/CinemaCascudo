package telas;

import java.util.Scanner;

import cadastro.Pessoa;

public class CadastroConsoleString {

	static public Pessoa cadastro() {
		Scanner ler = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "===================              ================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================== CINE CASCUDO =================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================              ===================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=   PREENCHER O FORMULARIO PARA SE CADASTRAR    =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=-----------------------------------------------=");
		System.out.println("\t\t\t\t\t\t\t\t" + "                                                 ");
		System.out.println("\t\t\t\t\t\t\t\t" + "                                                 ");
		System.out.print  ("\t\t\t\t\t\t\t\t" + "=== NOME: ");
		pessoa.setNome(ler.nextLine());
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.print  ("\t\t\t\t\t\t\t\t" + "=== CPF:  ");
		pessoa.setCpf(ler.nextLine());
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.print  ("\t\t\t\t\t\t\t\t" + "=== TELEFONE: ");
		pessoa.setTelefone(ler.nextLine());
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.print  ("\t\t\t\t\t\t\t\t" + "=== IDADE: ");
		pessoa.setIdade(ler.nextInt());
		ler.nextLine();
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.print  ("\t\t\t\t\t\t\t\t" + "=== LOGIN: ");
		pessoa.getLoginSenha().setLogin(ler.nextLine());
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.print  ("\t\t\t\t\t\t\t\t" + "=== SENHA: ");
		pessoa.getLoginSenha().setSenha(ler.nextLine());
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=-----------------------------------------------=");
		System.out.println("\t\t\t\t\t\t\t\t" + "===    UNIVERSIDADE ESTADUAL DO TOCANTINS     ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");	
		return pessoa;
	}
}
