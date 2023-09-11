package aula7;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scann = new Scanner(System.in);
	
		
		int i = 0;
		
		while(i != 10) {
			
			System.out.println("Informe um número: ");
			int n = scann.nextInt();
			
			if(n >= 12 && n <= 20) {
				
				i++;
			} else {
				
				System.out.println("Número inválido.");
			}
		}
		
		System.out.println("Fim!");

	}

}