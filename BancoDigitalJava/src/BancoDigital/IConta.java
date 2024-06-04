package BancoDigital;

public interface IConta {
	//Essa é nossa INTERFACE 
	
    void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);

}
