package testes;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestaConta {
	
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		//Conta c1 = new ContaPoupanca();
		c1.depositar(1200);
		c1.setTitular("Cliente 1");
		c1.setAgencia("003");
		c1.setNumero(12345);
		c1.sacar(30);
		
		System.out.println("Conta Tipo: " + c1.getTipo());
		System.out.println("Conta: " + c1.getSaldo());
		
		ContaCorrente cc = new ContaCorrente(1200);
		cc.setTitular("Cliente 2");
		cc.sacar(30);
		System.out.println("Conta Corrente: " + cc.getSaldo());
		
		
		ContaPoupanca cp = new ContaPoupanca(1200);
		cp.setTitular("Cliente 3");
		cp.sacar(30);
		System.out.println("Conta Poupança: " + cp.getSaldo());
		
		cp.transfere(300, c1);
	
		System.out.println("Conta: " + c1.getSaldo());
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());
		
	}
}
