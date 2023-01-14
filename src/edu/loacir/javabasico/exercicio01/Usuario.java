package edu.loacir.javabasico.exercicio01;

public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada: " + smartTv.ligada);
		System.out.println("Canal Atual: " + smartTv.canal);
		System.out.println("Volume Atual: "+ smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo status: " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status: " + smartTv.ligada);
		
		smartTv.aumentarVolume();
		System.out.println("Volume Atual: "+ smartTv.volume);
		
		smartTv.mudarCanal(10);
		System.out.println(smartTv.canal);

	}

}
