
public class TestaConta {
	
	public static void main(String[] args) {
		Conta c1 = new Conta(1200);
		c1.setTitular("Cliente 1");
		c1.setAgencia("003");
		c1.setNumero(12345);
		c1.sacar(30);
		c1.depositar(500);
		
		System.out.println(c1.getSaldo());
		
		ContaCorrente cc = new ContaCorrente(1200);
		cc.setTitular("Cliente 2");
		cc.sacar(30);
		System.out.println(cc.getSaldo());
		
		
		ContaPoupanca cp = new ContaPoupanca(1200);
		cp.setTitular("Cliente 3");
		cp.sacar(30);
		System.out.println(cp.getSaldo());
		
	}
}
