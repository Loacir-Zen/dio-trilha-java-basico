package edu.loacir.javabasico.primeirasemana;

public class TiposVariaveis {

	public static void main(String[] args) {
		
		double salarioMinimo = 2500;
		System.out.println(salarioMinimo);
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		//short numeroCurto2 = numeroNormal; não é possível converter
		short numeroCurto2 = (short)numeroNormal;
		
		System.out.println(numeroCurto2);
		
		int numero = 5;
		numero = 100;
		System.out.println(numero);
		
		final double VALOR_DE_PI = 3.14;
		System.out.println(VALOR_DE_PI);
		
		
		
		

	}

}
