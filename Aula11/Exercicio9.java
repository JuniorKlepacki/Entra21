package Aula11;

import java.util.Random;

public class Exercicio9 {

	public static void main(String[] args) {
		/*
		 * Crie uma matriz com 7 linhas e 8 colunas do tipo inteiro, para preencher a
		 * mesma utilize o Random de java.util.Random, posteriormente imprima esta
		 * matriz;
		 */
		Random num = new Random();
		int teste= num.nextInt(10);
		System.out.println(teste);
		int[][] matriz = new int[7][8];
		
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

	}
}
