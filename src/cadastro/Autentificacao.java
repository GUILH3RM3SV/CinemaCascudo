package cadastro;

import java.util.ArrayList;
import java.util.List;

public class Autentificacao {
	List<Pessoa> cadastrados = new ArrayList<Pessoa>();

	public List<Pessoa> getCadastrados() {
		return cadastrados;
	}

	public void setCadastrados(List<Pessoa> cadastrados) {
		this.cadastrados = cadastrados;
	}

	public boolean autenticar(DadosDeAcesso verificarAcesso) {
		for (Pessoa pessoa : cadastrados) {
			if (pessoa.getLoginSenha().getLogin().equals(verificarAcesso.getLogin()) 
					&& pessoa.getLoginSenha().getSenha().equals(verificarAcesso.getSenha())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean autenticarCadastro(Pessoa verificarCadastroLogin) {
		for (Pessoa pessoa : cadastrados) {
			if (pessoa.getLoginSenha().getLogin().equals( verificarCadastroLogin.getLoginSenha().getLogin())) {
				return false;
			}
			else {
				cadastrados.add(verificarCadastroLogin);
				return true;
			}
		}
		return true;
	}

	public void pessoasExemploLista() {
		cadastrados.add((new Pessoa("Joao", 29, "joao@cascudo.com", "java")));
		cadastrados.add((new Pessoa("Guilherme", 19, "guilhermesv@gmail.com", "123")));
		cadastrados.add((new Pessoa("Anastacia", 24, "anastacia@cascudo.com", "java")));
		//CONTA ADMIN
		cadastrados.add((new Pessoa("Admin Corno", 30, "admin@admin.com", "admin")));
		cadastrados.add((new Pessoa("Admin 1", 1, "1", "1")));
	}
}
