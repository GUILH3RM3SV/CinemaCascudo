package cadastro;

public class Pessoa {
	private String nome;
	private String cpf;
	private String telefone;
	private Integer idade;
	private DadosDeAcesso loginSenha = new DadosDeAcesso();
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String cpf, String telefone, Integer idade, DadosDeAcesso loginSenha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
		this.loginSenha = loginSenha;
	}
	
	public Pessoa(String nome, Integer idade, String login, String senha) {
		super();
		this.nome = nome;
		this.idade = idade;
		loginSenha.setLogin(login); 
		loginSenha.setSenha(senha);
	}

	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public DadosDeAcesso getLoginSenha() {
		return loginSenha;
	}
	public void setLoginSenha(DadosDeAcesso loginSenha) {
		this.loginSenha = loginSenha;
	}
	//------------------------------------------------------------------------------------
	
}
