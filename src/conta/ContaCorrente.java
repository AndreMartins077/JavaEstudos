package conta;

public class ContaCorrente extends ContaBancaria {
	
	private double credito;
	private double fatura;
	private double tarifa;
	
	public ContaCorrente(String titular, double saldo, double credito, double fatura, double tarifa) {
		super(titular, saldo);
		this.credito = credito;
		this.fatura = fatura;
		this.tarifa = tarifa;
	}
	
	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public double getFatura() {
		return fatura;
	}

	public void setFatura(double fatura) {
		this.fatura = fatura;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public void trazConta() {
		System.out.println("Titular: " + getTitular() );
		System.out.println("Saldo: " + getSaldo() );
		System.out.println("Fatura: " + getFatura() );
	}

	@Override
	public double depositar(double valor, double saldo) {
		saldo += valor;
		System.out.println("##########");
		System.out.println("Voc� efetuou um dep�sito no valor de: " + valor);
		System.out.println("O Saldo final � de: " + saldo);
		setSaldo(saldo);
		return getSaldo();
	}

	@Override
	public double sacar(double valor, double saldo) {
		saldo -= valor;
		System.out.println("##########");
		System.out.println("Voc� efetuou um saque no valor de: " + valor);
		System.out.println("O Saldo final � de: " + saldo);
		setSaldo(saldo);
		return getSaldo();
	}
	
	public double pagarfatura(double valor, double saldo) {
	saldo -= valor;
	fatura -= valor;
	System.out.println("##########");
	System.out.println("Voce Realizou o Pagamento da Fatura De " + valor + 
				".\nSeu Saldo de Conta Corrente � de " + saldo + "." + 
				"\nA fatura final ficou equivalente a: " + fatura + ".");
	System.out.println("##########");
	return fatura;	
	}

}
