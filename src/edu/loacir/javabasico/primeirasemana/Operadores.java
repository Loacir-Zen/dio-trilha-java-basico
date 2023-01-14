package edu.loacir.javabasico.primeirasemana;

public class Operadores {

	public static void main(String[] args) {
		
		String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
		System.out.println(nomeCompleto);
		
		String concatenacao ="?";
		concatenacao = 1+1+1+"1";
		
		concatenacao = 1+"1"+1+1;
		
		concatenacao = 1+"1"+1+"1";
		
		concatenacao = "1"+1+1+1;
		
		concatenacao = "1"+(1+1+1);
		
		
		int numero = 5;
		numero = - numero;
		System.out.println(numero);
		
		numero = - numero; // numero = numero * -1;
		System.out.println(numero);
		
		
		int numeroX = 5;
		numeroX = numeroX + 2;
		System.out.println(numeroX);
		
		int numeroY = 5;
		numeroY++;
		System.out.println(numeroY);
		
		boolean variavel = true;
		System.out.println(!variavel);
		
		
		int a, b;
		
		a = 6;
		b = 6;
		
		String resultado = a==b ? "verdadeiro" : "falso";
		
		System.out.println(resultado);
		
		
		int numero1 = 1;
		int numero2 = 2;
		
		boolean sinNao = numero1 == numero2;
		System.out.println("numero1 é igual a numero2 ? " + sinNao);
		
		sinNao = numero1 != numero2;
		System.out.println("numero1 é diferente a numero2 ? " + sinNao);
		
		sinNao = numero1 > numero2;
		System.out.println("numero1 é maior a numero2 ? " + sinNao);
		
		
		String nomeUm = "Loacir";
		String nomeDois = "Loacir";
		
		System.out.println(nomeUm == nomeDois);
		
		String nomeTres = new String("Loacir");
		System.out.println(nomeUm == nomeTres);
		System.out.println(nomeUm.equals(nomeTres));
		
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if(condicao1 && condicao2) {
			System.out.println("As duas confições são verdadeira");
		} else {
			System.out.println("As duas confições não são verdadeira");
		}
		
		if(condicao1 || condicao2) {
			System.out.println("Uma das confições é verdadeira");
		}else {
			System.out.println("Nenhuma confição é verdadeira");
		}

	}

}
