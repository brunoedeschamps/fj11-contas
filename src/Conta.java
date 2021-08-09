
public class Conta {
	
	private double saldo;
	private String Titular;
	private int numero;
	private String agencia;
	
	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public Conta() {
	
	}

	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}


}
