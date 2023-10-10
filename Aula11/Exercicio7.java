package Aula11;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Crie uma matriz 3x3 do tipo, onde o usuário irá preencher os valores
		 * utilizando o scanner, ao fim imprima a matriz
		 */
		Scanner scan = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		System.out.println("Preencha a matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite o valor para a posição, [" + i + "] [" + j + "] \n");

				matriz[i][j] = scan.nextInt();
			}
		}
		System.out.println("\nSua matriz:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}