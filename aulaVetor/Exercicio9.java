package aulaVetor;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler os valores de dois vetores de inteiros, cada um
		 * contendo 10 elementos.
		 * Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas
		 * posições respectivas dos vetores originais.
	
		 */
		Scanner scanner = new Scanner(System.in);
		int tamanho = 10;
		int[] vetor1 = new int[tamanho];
		int[] vetor2 = new int[tamanho];
		int[] vetor3 = new int[tamanho];

		System.out.println("Digite os valores do primeiro vetor:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print("Digite o valor: ");
			vetor1[i] = scanner.nextInt();
		}

		System.out.println("Digite os valores do segundo vetor:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print("Digite o valor : ");
			vetor2[i] = scanner.nextInt();
		}

		for (int i = 0; i < tamanho; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}

		System.out.println("Vetor 1:");
		for (int valor : vetor1) {
			System.out.print(valor + " ");
		}

		System.out.println("Vetor 2:");
		for (int valor : vetor2) {
			System.out.print(valor + " ");
		}

		System.out.println("Vetor 3 (Soma dos Vetores 1 e 2):");
		for (int valor : vetor3) {
			System.out.print(valor + " ");
		}
	}
}