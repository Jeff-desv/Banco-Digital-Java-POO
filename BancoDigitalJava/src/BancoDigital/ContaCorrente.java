package BancoDigital;

public class ContaCorrente extends Conta {
	//Usamos o Extends para que a Conta Corrente Herde os dados da Class Conta

	@Override
	public void imprimirExtrato() {
		System.out.println(" **** Extrato Conta Corrente **** ");
		super.imprimirInfosComuns();
	}
}
