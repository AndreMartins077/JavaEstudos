import conta.ContaCorrente;
import pessoa.Cliente;

public class Main {
	
	public static void main(String[] args) {
		
		ContaCorrente contaAndre = new ContaCorrente("Andre Martins", 2000, 3000, 2500, 45);
		Cliente andre = new Cliente("Andre Martins", "436.056.348-50", contaAndre);
	
		andre.getConta().trazConta();
		
		
	}

}