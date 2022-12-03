package seguros;

import contas.Conta;

public class SeguroPessoFisica extends Conta{

	public static void main(String[] args) {
		
		SeguroPessoFisica cc3 = new SeguroPessoFisica();
		cc3.setCliente  ("Robson Moreira");
		cc3.setSaldo (1200.0);
		
		System.out.println("Cliente: " + cc3.getCliente());
		
		cc3.exibirSaldo();

	}

}
