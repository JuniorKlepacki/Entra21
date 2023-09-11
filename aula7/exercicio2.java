package aula7;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número
		 * igual a zero. No final, mostre a soma dos números digitados.
		 */
         int entrada= 0;
         int soma= 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe valores");
		 entrada = scan.nextInt();
		 soma = entrada;
		
	
	        while (entrada >=0) {
			System.out.println("Informe valores");
			entrada = scan.nextInt();
			soma += entrada;
		}
		
		System.out.println("A soma dos números é igual a:" + soma);

	}

}
