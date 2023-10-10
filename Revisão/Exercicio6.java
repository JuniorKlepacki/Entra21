package Revisão;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Descreva um algoritmo que leia 12 valores decimais e os coloque em um vetor
		 * de 12 posições.
		 * 
		 * Em seguida, modifique o vetor de modo que os valores das POSIÇÕES ímpares
		 * sejam aumentados em 5% e os das posições pares sejam aumentados em 2%.
		 * 
		 * Imprima o vetor resultante
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[12];
		double[] array2 = new double[12];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite o valor : ");
			array[i] = scanner.nextDouble();
			if (array[i] % 2 == 0) {
				array[i] = array[i] * 1.02;
			} else {
				array[i] = array[i] * 1.05;
			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

	}
}