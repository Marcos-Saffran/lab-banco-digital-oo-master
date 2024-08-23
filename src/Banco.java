import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

/**
 * Banco
 * 
 * Classe que representa um banco
 */
public class Banco {

	@Getter
	private String nome;
	@Getter
	private List<Conta> contas;

	/**
	 * Construtor
	 * 
	 * @param nome Nome do banco
	 */
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	/**
	 * Adiciona uma conta ao banco
	 * 
	 * @param conta Conta a ser adicionada
	 */
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}

	/**
	 * Remove uma conta do banco
	 * 
	 * @param conta Conta a ser removida
	 */
	public void removerConta(Conta conta) {
		this.contas.remove(conta);
	}

	/**
	 * Imprime as contas do banco
	 */
	public void imprimirContas() {
		System.out.println("=== Contas do Banco ===" + this.nome);
		for (Conta conta : contas) {
			conta.imprimirDadosDaConta();
		}
	}


}
