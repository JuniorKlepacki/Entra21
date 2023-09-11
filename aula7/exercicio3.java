package aula7;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa
		 * digitar um número diferente, mostrar a mensagem "entrada inválida" e
		 * solicitar o número novamente. Se digitar correto mostrar o número digitar*/
        int total= 0;
     
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor entre 12 e 20 :");
		int entrada = scan.nextInt();
		
		while (entrada < 12 || entrada > 20 || total > 10) {
			System.out.println("Entrada inválida, insira outro números");
			entrada = scan.nextInt();
			
				}
		System.out.println("Fimmm");
        }
	}
