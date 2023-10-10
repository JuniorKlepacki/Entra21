package Revisão;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Descreva um algoritmo que leia vá lendo números inteiros até o usuário entrar
		 * com o número 0
		 * 
		 * a) Qual é o menor valor?
		 * 
		 * b) Qual é o maior valor?
		 * 
		 * c) Qual é a média dos valores?
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		int numero;
		int menor = Integer.MAX_VALUE; // Inicializado com o maior valor possível
		int maior = Integer.MIN_VALUE; // Inicializado com o menor valor possível
		int soma = 0;
		int quantidade = 0;

		System.out.println("Digite números inteiros (0 para sair):");

		numero = scanner.nextInt();

		while (numero != 0) {
	
			if (numero < menor) {
				menor = numero;
			}
			if (numero > maior) {
				maior = numero;

			}
			soma += numero;
			quantidade++;
			System.out.println("Digite próximo numero");
			numero = scanner.nextInt();
		}

		if (quantidade > 0) {
			double media = soma / quantidade;
			System.out.println("Menor valor: " + menor);
			System.out.println("Maior valor: " + maior);
			System.out.println("Média dos valores: " + media);
		} else {
			System.out.println("Nenhum número válido foi inserido.");
		}

	}
}