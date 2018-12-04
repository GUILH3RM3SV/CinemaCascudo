package telas;

import java.util.Scanner;

import aplicacao.Principal;
import filmes.Filmes;

public class MenuUsuario {

	static public void menuUsuario() {
		Scanner ler = new Scanner(System.in);
		Integer opcao = null;
		Integer loop = 1;
		
		while(loop == 1) {
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "===================              ================");
			System.out.println("\t\t\t\t\t\t\t\t" + "================== CINE CASCUDO =================");
			System.out.println("\t\t\t\t\t\t\t\t" + "================              ===================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===           [1] FILMES EM EXIBIÇÃO          ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===           [2] FILMES EM CARTAZ            ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===           [3] SAIR                        ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=-----------------------------------------------=");
			System.out.println("\t\t\t\t\t\t\t\t" + "===    UNIVERSIDADE ESTADUAL DO TOCANTINS     ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\n" + "\t\t\t\t\t\t\t\t" + "-------------------------------------------------");
			System.out.print("\t\t\t\t\t\t\t\t" + "OPÇÃO DE ACESSO: ");
			opcao = ler.nextInt();
			
			loop = opcaoEscolhidaMenu(opcao);
		}
	}

	static private Integer opcaoEscolhidaMenu(Integer opcao) {
		Integer i = 0;
		switch (opcao) {
		case 1:
			if (Filmes.filmesEmExibicao())
				i = 1;
			break;
		case 2:
			if (Filmes.filmesEmCartaz()) 
				i = 1;
			break;
		case 3:
			Principal.main(null);
			break;
		default:
			System.out.println("\t\t\t\t\t\t\t\t" + "INSIRA UM COMANDO VALIDO");
			break;
		}
		return i;
	}
}