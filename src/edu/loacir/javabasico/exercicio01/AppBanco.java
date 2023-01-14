package edu.loacir.javabasico.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class AppBanco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		BancoTerminal banco = new BancoTerminal();
		banco.depositar(scan.nextDouble());

	}

}
