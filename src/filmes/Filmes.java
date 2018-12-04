package filmes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import telas.MenuUsuario;

public class Filmes {
	// -------------------------------------------ATRIBUTOS DA CLASSE
	private String nome;
	private Integer codigo;
	static List<Filmes> listaFilmesEmCartaz = new ArrayList<Filmes>();
	static List<Filmes> listaFilmesEmExibicao = new ArrayList<Filmes>();

	// ---------------------------------------------METODOS DA CLASSE
	static public void opcoes() {
		boolean decisao = false;
		while (decisao == false) {
			Filmes f = new Filmes();
			Scanner scanner = new Scanner(System.in);
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "===================              ================");
			System.out.println("\t\t\t\t\t\t\t\t" + "================== CINE CASCUDO =================");
			System.out.println("\t\t\t\t\t\t\t\t" + "================              ===================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "===        [1] INSERIR FILME EM CARTAZ        ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===        [2] REMOVER FILME EM CARTAZ        ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===  [3] IMPRIMIR LISTA DE FILMES EM CARTAZ   ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "===       [4] INSERIR FILME EM EXIBI��O       ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===       [5] REMOVER FILME EM EXIBI��O       ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===  [6] IMPRIMIR LISTA DE FILMES EM EXIBI��O ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "===  [7] VERIFICAR FILME EM CARTAZ EXISTENTE  ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "=== [8] VERIFICAR FILME EM EXIBI��O EXISTENTE ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\t\t\t\t\t\t\t\t" + "=-----------------------------------------------=");
			System.out.println("\t\t\t\t\t\t\t\t" + "===    UNIVERSIDADE ESTADUAL DO TOCANTINS     ===");
			System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
			System.out.println("\n" + "\t\t\t\t\t\t\t\t" + "-------------------------------------------------");
			System.out.print("\t\t\t\t\t\t\t\t" + "OP��O DE ACESSO: ");
			int escolha = scanner.nextInt();
			switch (escolha) {
				case 1:
					f.inserirFilmeEmCartaz();
					break;
				case 2:
					f.removerFilmeEmCartaz();
					break;
				case 3:
					filmesEmCartazAdmin();
					break;
				case 4:
					f.inserirFilmeEmExibicao();
					break;
				case 5:
					f.removerFilmeEmExibicao();
					break;
				case 6:
					filmesEmExibicaoAdmin();
					break;
				case 7:
					f.verificarFilmeExistenteEmCartaz();
					break;
				case 8:
					f.verificarFilmeExistenteEmExibicao();
					break;
				case 9:
					decisao = true;
					break;
				default:
					break;
			}
		}
	}

	// ------------------------------------------------- OPÇÕES DE FILMES EM
	// CARTAZ
	// 1° OPCAO DA LISTA
	// (INSERIR UM FILME EM CARTAZ A LISTA)
	public void inserirFilmeEmCartaz() {
		Scanner inserir = new Scanner(System.in);
		System.out.print("\t\t\t\t\t\t\t\t" + "CODIGO: ");
		Integer codigo = inserir.nextInt();
		System.out.print("\t\t\t\t\t\t\t\t" + "NOME: ");
		String nome = inserir.next();
		boolean condicao = false;
		for (Filmes f : listaFilmesEmCartaz) {
			if (codigo == f.getCodigo()) {
				System.out.println("");
				System.out.print("\t\t\t\t\t\t\t\t" + "** CODIGO J� EXISTENTE");
				System.out.println("");
				condicao = true;
			}
		}
		if (condicao == false) {
			listaFilmesEmCartaz.add(new Filmes(nome, codigo));
		}
	}

	// 2° OPCAO DA LISTA
	// (REMOVER FILME EM CARTAZ EXISTENTE)
	public void removerFilmeEmCartaz() {
		Scanner remover = new Scanner(System.in);
		System.out.println("");
		for (Filmes lista : listaFilmesEmCartaz) {
			System.out.println("\t\t\t\t\t\t\t\t=== " + lista);
		}
		System.out.print("\t\t\t\t\t\t\t\t" + "QUAL DESEJA REMOVER(INSIRA O CODIGO): ");
		Integer r = remover.nextInt();
		for (int i = 0; i < listaFilmesEmCartaz.size(); i++) {
			Filmes f = listaFilmesEmCartaz.get(i);
			if (f.getCodigo().equals(r)) {
				listaFilmesEmCartaz.remove(f);
			}
		}
	}

	// 3° OPCAO DA LISTA
	// (IMPRIMIR LISTA COMPLETA DE FILMES EM CARTAZ)
	static public void verListaDeFilmesEmCartaz() {
		if (listaFilmesEmCartaz.isEmpty() == true) {
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t" + "** LISTA DE FILMES EM CARTAZ EST�? VAZIA **");
			System.out.println("");
		} else {
			Filmes.filmesEmCartazAdmin();
		}
		System.out.println("");
	}

	// ------------------------------------------------------------ OPÇÕES DE
	// FILMES EM EXIBIÇÃO
	// 4° OPÇÃO DA LISTA
	// (INSERIR FILME EM EXIBIÇÃO NA LISTA)
	public void inserirFilmeEmExibicao() {
		Scanner inserir = new Scanner(System.in);
		System.out.print("\t\t\t\t\t\t\t\t" +"CODIGO DO FILME: ");
		Integer codigo = inserir.nextInt();
		inserir.nextLine();
		System.out.print("\t\t\t\t\t\t\t\t" +"NOME: ");
		String nome = inserir.nextLine();
		boolean condicao = false;
		for (Filmes f : listaFilmesEmExibicao) {
			if (codigo == f.getCodigo()) {
				System.out.println("");
				System.out.print("\t\t\t\t\t\t\t\t" + "** CODIGO J� EXISTENTE");
				System.out.println("");
				condicao = true;
			}
		}
		if (condicao == false) {
			listaFilmesEmExibicao.add(new Filmes(nome, codigo));
		}
	}

	// 5° OPÇÃO DA LISTA
	// (REMOVER FILME EM EXIBIÇÃO DA LISTA)
	public void removerFilmeEmExibicao() {
		Scanner remover = new Scanner(System.in);
		for (Filmes lista : listaFilmesEmExibicao) {
			System.out.println("\t\t\t\t\t\t\t\t=== " + lista);
		}
		System.out.print("\t\t\t\t\t\t\t\t" + "QUAL DESEJA REMOVER(INSIRA O CODIGO): ");
		Integer r = remover.nextInt();
		for (int i = 0; i < listaFilmesEmExibicao.size(); i++) {
			Filmes f = listaFilmesEmExibicao.get(i);
			if (f.getCodigo().equals(r)) {
				listaFilmesEmExibicao.remove(f);
			}
		}
	}

	// 6° OPÇÃO LISTA
	// (VER LISTA COMPLETA DE FILMES EM EXIBIÇÃO)
	static public void verListaDeFilmesEmExibicao() {
		if (listaFilmesEmExibicao.isEmpty() == true) {
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t" + "** LISTA DE FILMES EM EXIBIÇÃO EST�? VAZIA **");
			System.out.println("");
		} else {
			Filmes.filmesEmExibicaoAdmin();
		}
	}

	// ----------------------------------------------------------------- OPÇÕES DE
	// VERIFICAÇÃO DE FILMES EXISTENTES

	// 7° OPCAO DA LISTA
	// (VERIFICAR SE ALGUM FILME EM CARTAZ EXISTE, INSERINDO O CODIGO DO FILME)
	public void verificarFilmeExistenteEmCartaz() {
		Scanner verificar = new Scanner(System.in);
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t" + "DIGITE O CODIGO DO FILME: ");
		long verificarCodigo = verificar.nextLong();
		boolean condicao = false;
		for (Filmes lista : listaFilmesEmCartaz) {
			if (verificarCodigo == lista.getCodigo()) {
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\t" + "CODIGO DE FILME CAPTURADO: " + lista.getCodigo());
				System.out.print("\t\t\t\t\t\t\t\t" + "NOME DO FILME: " + lista.getNome());
				System.out.println("");
				condicao = true;
			}
		}
		if(condicao == false) {
			System.out.println("");
			System.out.print("\t\t\t\t\t\t\t\t" + "CODIGO NAO EXISTENTE");
			System.out.println("");
		}
	}

	// 8° OPCAO DA LISTA
	// (VERIFICAR SE ALGUM FILME EM EXIBIÇÃO EXISTE, INSERINDO O CODIGO DO FILME)
	public void verificarFilmeExistenteEmExibicao() {
		Scanner verificar = new Scanner(System.in);
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t" + "DIGITE O CODIGO DO FILME: ");
		Integer verificarCodigo = verificar.nextInt();
		boolean condicao = false;
		for (Filmes lista : listaFilmesEmExibicao) {
			if (verificarCodigo == lista.getCodigo()) {
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t\t" + "CODIGO DE FILME CAPTURADO: " + lista.getCodigo());
				System.out.print("\t\t\t\t\t\t\t\t" + "NOME DO FILME: " + lista.getNome());
				System.out.println("");
				condicao = true;
			}
		}
		if(condicao == false) {
			System.out.println("");
			System.out.print("\t\t\t\t\t\t\t\t" + "** CODIGO NAO EXISTENTE **");
			System.out.println("");
		}
	}

	// ----------------------------------------------------------- LISTA DE FILMES
	// EM CARTAZ PREDEFINIDA
	static public void listaDeFilmesEmCartaz() {
		listaFilmesEmCartaz.add(new Filmes("Vingadores: guerra infinita", 0));
		listaFilmesEmCartaz.add(new Filmes("Rei Leão", 1));
		listaFilmesEmCartaz.add(new Filmes("Exterminadores do além", 2));
		listaFilmesEmCartaz.add(new Filmes("Robin Hood: the origins", 3));
		listaFilmesEmCartaz.add(new Filmes("De repente uma familia", 4));
		listaFilmesEmCartaz.add(new Filmes("As viuvas", 5));
		listaFilmesEmCartaz.add(new Filmes("Parque do inferno", 6));
		listaFilmesEmCartaz.add(new Filmes("Burn the stage", 7));
		listaFilmesEmCartaz.add(new Filmes("O Doutrinador", 8));
		listaFilmesEmCartaz.add(new Filmes("O Grinch", 9));
	}

	static public void listaDeFilmesEmExibicao() {
		listaFilmesEmExibicao.add(new Filmes("Star Wars: O Despertar da Força", 0));
		listaFilmesEmExibicao.add(new Filmes("Jurassic World: O Mundo dos Dinossauros", 1));
		listaFilmesEmExibicao.add(new Filmes("Velozes e Furiosos 7", 2));
		listaFilmesEmExibicao.add(new Filmes("Vingadores: Era de Ultron", 3));
		listaFilmesEmExibicao.add(new Filmes("Harry Potter e as Relíquias da Morte II", 4));
		listaFilmesEmExibicao.add(new Filmes("Frozen: Uma Aventura Congelante", 5));
		listaFilmesEmExibicao.add(new Filmes("A Bela e a Fera", 6));
		listaFilmesEmExibicao.add(new Filmes("Um Sonho de Liberdade", 7));
		listaFilmesEmExibicao.add(new Filmes("De Volta para o Futuro", 8));
		listaFilmesEmExibicao.add(new Filmes("A Felicidade não se Compra", 9));
	}

	// ------------------------------------------------------------------- LISTA DE
	// FILMES EM EXIBIÇÃO PREDEFINIDA

	// -----------------------------------------------------------CONSTRUTORES DA
	// CLASSE
	public Filmes() {

	}

	public Filmes(String nome, Integer codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	// -----------------------------------------------------------METODOS GETTERS E
	// SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public static List<Filmes> getListaFilmesEmCartaz() {
		return listaFilmesEmCartaz;
	}

	public static void setListaFilmesEmCartaz(List<Filmes> listaFilmesEmCartaz) {
		Filmes.listaFilmesEmCartaz = listaFilmesEmCartaz;
	}

	public static List<Filmes> getListaFilmesEmExibicao() {
		return listaFilmesEmExibicao;
	}

	public static void setListaFilmesEmExibicao(List<Filmes> listaFilmesEmExibicao) {
		Filmes.listaFilmesEmExibicao = listaFilmesEmExibicao;
	}

	// -----------------------------------------------------------SOBREESCRITA DO
	// METODO TO STRING
	@Override
	public String toString() {
		return "CODIGO: " + getCodigo() + " NOME: " + getNome();
	}

	static public boolean filmesEmExibicao() {
		Scanner ler = new Scanner(System.in);
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "===================              ================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================== CINE CASCUDO =================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================              ===================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		listaFilmesEmExibicao.forEach(lista -> System.out.println("\t\t\t\t\t\t\t\t=== " + lista.getNome()));
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                [1] VOLTAR                 ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "=-----------------------------------------------=");
		System.out.println("\t\t\t\t\t\t\t\t" + "===    UNIVERSIDADE ESTADUAL DO TOCANTINS     ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\n" + "\t\t\t\t\t\t\t\t" + "-------------------------------------------------");
		System.out.print("\t\t\t\t\t\t\t\t" + "OP��O DE ACESSO: ");
		if (ler.nextInt() == 1) {
			return true;
		}
		return false;
	}

	static public boolean filmesEmCartaz() {
		Scanner ler = new Scanner(System.in);
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "===================              ================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================== CINE CASCUDO =================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================              ===================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		listaFilmesEmCartaz.forEach(lista -> System.out.println("\t\t\t\t\t\t\t\t=== " + lista.getNome()));
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                [1] VOLTAR                 ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "=-----------------------------------------------=");
		System.out.println("\t\t\t\t\t\t\t\t" + "===    UNIVERSIDADE ESTADUAL DO TOCANTINS     ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\n" + "\t\t\t\t\t\t\t\t" + "-------------------------------------------------");
		System.out.print("\t\t\t\t\t\t\t\t" + "OP��O DE ACESSO: ");
		if (ler.nextInt() == 1) {
			return true;
		}
		return false;
	}

	static public boolean filmesEmExibicaoAdmin() {
		Scanner ler = new Scanner(System.in);
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "===================              ================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================== CINE CASCUDO =================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================              ===================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		listaFilmesEmExibicao.forEach(lista -> System.out.println("\t\t\t\t\t\t\t\t=== " + lista));
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                [1] VOLTAR                 ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "=-----------------------------------------------=");
		System.out.println("\t\t\t\t\t\t\t\t" + "===    UNIVERSIDADE ESTADUAL DO TOCANTINS     ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\n" + "\t\t\t\t\t\t\t\t" + "-------------------------------------------------");
		System.out.print("\t\t\t\t\t\t\t\t" + "OP��O DE ACESSO: ");
		if (ler.nextInt() == 1) {
			return true;
		}
		return false;
	}

	static public boolean filmesEmCartazAdmin() {
		Scanner ler = new Scanner(System.in);
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "===================              ================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================== CINE CASCUDO =================");
		System.out.println("\t\t\t\t\t\t\t\t" + "================              ===================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		listaFilmesEmCartaz.forEach(lista -> System.out.println("\t\t\t\t\t\t\t\t=== " + lista));
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                [1] VOLTAR                 ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "===                                           ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "=-----------------------------------------------=");
		System.out.println("\t\t\t\t\t\t\t\t" + "===    UNIVERSIDADE ESTADUAL DO TOCANTINS     ===");
		System.out.println("\t\t\t\t\t\t\t\t" + "=================================================");
		System.out.println("\n" + "\t\t\t\t\t\t\t\t" + "-------------------------------------------------");
		System.out.print("\t\t\t\t\t\t\t\t" + "OP��O DE ACESSO: ");
		if (ler.nextInt() == 1) {
			return true;
		}
		return false;
	}
}
