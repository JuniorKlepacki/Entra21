package aula7;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Escreva um algoritmo que leia um número do teclado até que encontre um número menor ou igual a 1.
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe valores");
		int entrada = scan.nextInt();
      
		while (entrada >= 1) {
			System.out.println("Informe valores");
			entrada = scan.nextInt();
		}
		System.out.println("Fimmm");
	}
}
