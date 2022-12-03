package contas;

public class Conta {

	//atributos
	private String cliente;
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	private double saldo;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//metodo construtor
	public Conta() {
		System.out.println("Agencia 0261");
	}
	//metodos
	protected void exibirSaldo(){
		System.out.println("Mostra saldo R$ " + saldo);
	}
	void sacar(double valor ) {
		saldo -= valor;
		System.out.println("Debito: R$ " + valor);
	}
	void depositar(double valor ) {
		saldo += valor;
		System.out.println("Credito: R$ " + valor);
	}
	void transferir(Conta destina, double valor) {
		this.sacar(valor);
		destina.depositar(valor);
		System.out.println("Tranferencia R$ " + valor);
	}
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
	}
	
}
