
public class Main {

	public static void main(String[] args) {


		Banco bancoPrimeiroBanco = new Banco("Banco Primeiro");

		Banco bancoSegundoBanco = new Banco("Banco Segundo");


		Cliente cliente1BancoPrimeiro = new Cliente();
		cliente1BancoPrimeiro.setNome("Cliente 1 banco Primeiro");
		
		Conta contaCliente1BancoPrimeiro = new ContaCorrente(cliente1BancoPrimeiro);
		Conta poupancaCliente1BancoPrimeiro = new ContaPoupanca(cliente1BancoPrimeiro);

		Cliente cliente2BancoPrimeiro = new Cliente();
		cliente2BancoPrimeiro.setNome("Cliente 2 banco Primeiro");
		
		Conta contaCliente2BancoPrimeiro = new ContaCorrente(cliente2BancoPrimeiro);
		Conta poupancaCliente2BancoPrimeiro = new ContaPoupanca(cliente2BancoPrimeiro);

		Cliente cliente1BancoSegundo = new Cliente();
		cliente1BancoSegundo.setNome("Cliente 1 banco Segundo");
		
		Conta contaCliente1BancoSegundo = new ContaCorrente(cliente1BancoSegundo);
		Conta poupancaCliente1BancoSegundo = new ContaPoupanca(cliente1BancoSegundo);

		Cliente cliente2BancoSegundo = new Cliente();
		cliente2BancoSegundo.setNome("Cliente 2 banco Segundo");
		
		Conta contaCliente2BancoSegundo = new ContaCorrente(cliente2BancoSegundo);
		Conta poupancaCliente2BancoSegundo = new ContaPoupanca(cliente2BancoSegundo);

		bancoPrimeiroBanco.adicionarConta(contaCliente1BancoPrimeiro);
		bancoPrimeiroBanco.adicionarConta(poupancaCliente1BancoPrimeiro);
		bancoPrimeiroBanco.adicionarConta(contaCliente2BancoPrimeiro);
		bancoPrimeiroBanco.adicionarConta(poupancaCliente2BancoPrimeiro);

		bancoSegundoBanco.adicionarConta(contaCliente1BancoSegundo);
		bancoSegundoBanco.adicionarConta(poupancaCliente1BancoSegundo);
		bancoSegundoBanco.adicionarConta(contaCliente2BancoSegundo);
		bancoSegundoBanco.adicionarConta(poupancaCliente2BancoSegundo);

		bancoPrimeiroBanco.imprimirContas();
		bancoSegundoBanco.imprimirContas();


		contaCliente1BancoPrimeiro.depositar(1000);
		contaCliente1BancoPrimeiro.imprimirExtrato();

		contaCliente1BancoPrimeiro.transferir(500, poupancaCliente2BancoSegundo);
		contaCliente1BancoPrimeiro.imprimirExtrato();
		poupancaCliente2BancoSegundo.imprimirExtrato();

	}

}
