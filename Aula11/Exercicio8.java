package Aula11;

public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * Dada a seguinte matriz, calcule:
		 * 
		 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 a) A soma dos elementos de primeira
		 * coluna; b) O produto dos elementos da primeira linha; c) A soma de todos os
		 * elementos; d) O produto da diagonal principal.
		 */
		int[][] matriz = { { 1, 2, 3, 4 },
				           { 5, 6, 7, 8 }, 
			               { 9, 10, 11, 12 }, 
				           { 13, 14, 15, 16 } };
		int soma = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			soma += matriz[linha][0];
		}
		System.out.println("A soma dos elemenos da 1º coluna : " + soma);

		int produto = 1;
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			produto *= matriz[0][coluna];
		}
		System.out.println("O produto da primeira linha : " + produto);

		int somaTotal = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				somaTotal += matriz[linha][coluna];
			}
		}
		System.out.println("A soma total dos elementos : " + somaTotal);

		int produto2 = 1;
		for (int linha = 0; linha < matriz.length; linha++) {
			produto2 *= matriz[linha][linha];
		}
		System.out.println("O produto da diagonal : " + produto2);
	}
}