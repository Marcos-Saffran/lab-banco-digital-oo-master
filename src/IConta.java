
/**
 * Interface que define os métodos que uma conta deve ter
 */
public interface IConta {
	/**
	 * Sacar um valor da conta
	 * @param valor
	 */
	void sacar(double valor);
	
	/**
	 * Depositar um valor na conta
	 * @param valor
	 */
	void depositar(double valor);
	
	/**
	 * Transferir um valor para outra conta
	 * @param valor
	 * @param contaDestino
	 */
	void transferir(double valor, IConta contaDestino);
	
	/**
	 * Imprimir o extrato da conta
	 */
	void imprimirExtrato();

	/**
	 * Imprimir os dados da conta
	 */
	void imprimirDadosDaConta();
}
