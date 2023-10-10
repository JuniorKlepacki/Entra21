package Aula11;
import java.util.Arrays;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Criem uma matriz de 5 linhas e 1 coluna, somem todos os valores
		 * Posteriormente verifique a média e imprima somente os valores que estão acima
		 * dela
		 */

		int[][] matriz = new int[5][1];
		int soma = 0;
		matriz[0][0] = -1;
		matriz[1][0] = 4;
		matriz[2][0] = 3;
		matriz[3][0] = 5;
		matriz[4][0] = 5;

		for (int linha = 0; linha < 5; linha++) {
			System.out.println(matriz[linha][0]);
			soma += matriz[linha][0];
		}
		double media = soma / 5; // quantidade de linha x coluna = total de eleme
		for (int linha = 0; linha < 5; linha++) {
			if (matriz[linha][0] > media) {
				System.out.println("o número " + matriz[linha][0] + " é maior que a média ");
			}

		}
	}
}