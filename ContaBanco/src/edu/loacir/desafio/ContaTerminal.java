package edu.loacir.desafio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência! ");
		numero = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Por favor, digite a agência! ");
		agencia = scanner.nextLine();
		System.out.println("Por favor, digite o nome do Cliente! ");
		nomeCliente = scanner.next();
		scanner.nextLine();
		System.out.println("Por favor, digite o saldo! ");
		saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
		
	}

}
