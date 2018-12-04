package aplicacao;

import cadastro.Autentificacao;
import cadastro.DadosDeAcesso;
import cadastro.Pessoa;
import filmes.Filmes;
import telas.CadastroConsoleString;
import telas.Inicio;
import telas.LoginConsoleString;
import telas.MenuUsuario;

public class Principal {

	public static void main(String[] args) {
		Filmes.listaDeFilmesEmExibicao();
		Filmes.listaDeFilmesEmCartaz();
		Integer loop = 1;
		DadosDeAcesso autentificacaoDeAcesso = new DadosDeAcesso();
		// ----------------INSTANCIAS--------------------
		Autentificacao verificar = new Autentificacao();
		Pessoa verificarCadastro = new Pessoa();
		// ----------------------------------------------
		verificar.pessoasExemploLista();
		
		// INICIO DO PROGRAMA
		while (loop == 1) {
			switch (Inicio.telaIniciar()) {
			case 1:
				autentificacaoDeAcesso = LoginConsoleString.interfaceConsoleLogin();
				if (verificar.autenticar(autentificacaoDeAcesso)) {
					MenuUsuario.menuUsuario();
				} else {
					System.out.println("\t\t\t\t\t\t\t\t" + "LOGIN OU SENHA INCORRETO");
				}
				break;
			case 2:
				autentificacaoDeAcesso = LoginConsoleString.interfaceConsoleLogin();
				if (verificar.autenticar(autentificacaoDeAcesso)) {
					Filmes.opcoes();
				} else {
					System.out.println("\t\t\t\t\t\t\t\t" + "LOGIN OU SENHA INCORRETO");
				}
				break;
			case 3:
				verificarCadastro = CadastroConsoleString.cadastro();
				if (verificar.autenticarCadastro(verificarCadastro)) {
					System.out.println("\t\t\t\t\t\t\t\t" + "Cadastro Efetuado");
				} else {
					System.out.println("\t\t\t\t\t\t\t\t" + "Cadastro Não Efetuado");
				}
				break;
			}
			verificar.getCadastrados().forEach(p -> System.out.println(p.getLoginSenha().getLogin()));
		}
	}
}