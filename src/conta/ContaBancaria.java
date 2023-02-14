package conta;

public abstract class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public abstract void trazConta ();
	
	public abstract double depositar(double valor, double saldo);
	
	public abstract double sacar(double valor, double saldo);
	
}
