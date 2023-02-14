import conta.ContaCorrente;
import pessoa.Cliente;

public class Main {
	
	public static void main(String[] args) {
		
		ContaCorrente contaAndre = new ContaCorrente("Andre Martins", 5000, 0, 2500, 0);
		Cliente andre = new Cliente("Andre Martins", "436.056.348-50", contaAndre);
		andre.getConta().trazConta();
		andre.getConta().depositar(5000, andre.getConta().getSaldo());
		andre.getConta().sacar(3700, andre.getConta().getSaldo());
	}

}


