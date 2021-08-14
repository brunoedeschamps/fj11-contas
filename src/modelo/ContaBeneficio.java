package modelo;
public class ContaBeneficio extends Conta {

	public String getTipo() {
		return "Beneficio";
		
	}

	@Override
	public String toString() {
		return "Conta Beneficio N°: " + getNumero()
		;
	}

}
