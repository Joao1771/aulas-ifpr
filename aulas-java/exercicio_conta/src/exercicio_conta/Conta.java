package exercicio_conta;

public class Conta {
	String titular;
	String numero;
	int saldo;
	
	public void sacar() {
		saldo = saldo + 10;
	}
	public void depositar() {
		saldo = saldo - 10;
	}
}
