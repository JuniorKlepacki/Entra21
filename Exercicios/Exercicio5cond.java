package Exercicios;

import java.util.Scanner;

public class Exercicio5cond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva nota de p1");
		double prova1 =entrada.nextDouble();
		System.out.println("Escreva nota de p2");
		double prova2 =entrada.nextDouble();
		System.out.println("Escreva a nota de seu trabalho");
		double trab =entrada.nextDouble();
		System.out.println("Escreva a quantidade de faltas durantes os 100 dias ");
		int falt=entrada.nextInt();
		
		
		double media= ((prova1*2)+(prova2*2)+ trab)/5;
		//processo 
		
		if (media<7  || falt >15 ){
			 System.out.println("Voce foi reprovado");
		} else {
			System.out.println("Voce foi reprovado");
		} 
		
		   System.out.println("Sua média é " + media );
		
		
		
		
		
		
		
	}

}
