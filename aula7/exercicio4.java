package aula7;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
		 * com o número 0 Calcule a média de altura das mesma
		 */
		double mediaaltura ;
		double media ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a altura e digite 0 quando quiser parar");
		double alt = scan.nextDouble();
		
		double soma=0 ;
		int total= 0;
		while (alt != 0) {
			soma += alt;
			total++;
			System.out.println("Infome as alturas");
			alt = scan.nextDouble();

		}
		double medialtura = (soma / total);
		System.out.println("A média das alturas é: " +  medialtura);
	}

}
