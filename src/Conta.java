import lombok.Getter;

/**
 * Conta
 * 
 * Classe abstrata que representa uma conta
 */
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	@Getter
	protected int agencia;
	@Getter
	protected int numero;
	@Getter
	protected double saldo;
	@Getter
	protected Cliente cliente;

	/**
	 * Construtor
	 * 
	 * @param cliente Cliente da conta
	 */
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	/**
	 * Imprime o extrato da conta
	 */
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	/**
	 * Imprime os dados da conta
	 */
	public void imprimirDadosDaConta(){
		System.out.println(String.format("Conta [agencia= %d, numero= %d, cliente=%s", this.agencia, this.numero, this.cliente.getNome()));
		
	}

}
