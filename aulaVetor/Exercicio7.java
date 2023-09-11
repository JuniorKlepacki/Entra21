package aulaVetor;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu e
		 * por fim printe o vetor
		 */
		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha um indice");
		int indice = scanner.nextInt();

		vetor[indice] = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
