package Aula11;

import java.util.Random;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Crie em Java uma matriz 3x5 de inteiros, preencha a matriz utilizando Randon
		 * e depois: a) Informe quantas vezes a matriz repete o número 0; b) A
		 * quantidade de números pares; c) A quantidade de números ímpares
		 */
		Random num = new Random();
		int[][] matriz = new int[3][5];
		int par = 0;
		int impar = 0;
		int zero = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = num.nextInt(10);
			}
		}
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (matriz[linha][coluna] == 0) {
					zero++;
				}

				if (matriz[linha][coluna] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			}

		}
		System.out.println("\nQnt números pares : " + par);
		System.out.println("\nQnt números impares : " + impar);
		System.out.println("\nQnt zeros : " + zero);
	}
}
