package modelo;
public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(double valor) {
		super();
		super.depositar(valor);
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return "Conta Poupança";
		
	}


	}

