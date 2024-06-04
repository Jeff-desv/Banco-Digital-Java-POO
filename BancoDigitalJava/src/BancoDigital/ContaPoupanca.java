package BancoDigital;

public class ContaPoupanca extends Conta {
	//Usamos o Extends para que a Conta Poupança Herde os dados da Class Conta

	@Override
	public void imprimirExtrato() {
		System.out.println(" ==== Extrato Conta Poupança ==== ");
		super.imprimirInfosComuns();
	}
}
