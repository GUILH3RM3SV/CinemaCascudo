package telas;

import java.util.Scanner;

import cadastro.DadosDeAcesso;

public class LoginConsoleString {

	public static DadosDeAcesso interfaceConsoleLogin() {
		Scanner ler = new Scanner(System.in);
		DadosDeAcesso loginSenha = new DadosDeAcesso();
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "===================              ================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================== CINE CASCUDO =================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================              ===================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.print  ("\t\t\t\t\t\t\t\t" + "=== LOGIN: ");
		loginSenha.setLogin(ler.nextLine());
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.print  ("\t\t\t\t\t\t\t\t" + "=== SENHA: ");
		loginSenha.setSenha(ler.nextLine());
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=                                               =");
		System.out.println("\t\t\t\t\t\t\t\t" + "=-----------------------------------------------=");
		System.out.println("\t\t\t\t\t\t\t\t" + "===    UNIVERSIDADE ESTADUAL DO TOCANTINS     ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		return loginSenha;
	}
}
