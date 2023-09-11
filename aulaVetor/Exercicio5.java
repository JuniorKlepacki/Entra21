package aulaVetor;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Crie um array de 10 elementos e depois peça ao usuário para informar um
		 * índice, imprima o o valor que está no vetor conforme indice informado pelo
		 * usuario
		 */
		Scanner scanner = new Scanner(System.in);
		int[] elementos = new int[10];
		for (int i = 0; i < elementos.length; i++) {
			System.out.println("Digite 10 números");
			elementos[i] = scanner.nextInt();
		}
		System.out.println("Escolha um indice");
		int op = scanner.nextInt();
		System.out.println(elementos[op]);
	}

}
