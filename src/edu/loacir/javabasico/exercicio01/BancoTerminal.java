package edu.loacir.javabasico.exercicio01;

public class BancoTerminal {
	
	private double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double quantia) {
		if(this.saldo < quantia) {
			System.out.println("Quantia insuficiente");
		} else {
			this.saldo = this.saldo - quantia;
			System.out.println("Saque efetuado com sucesso");
		}
	}
	
	public void depositar(double quantia) {
		this.saldo = this.saldo + quantia;
	}
	
	

}
