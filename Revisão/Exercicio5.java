package Revisão;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do
		 * seu índice Ex: [0] = 0 [1] = 1 [2] = 4 [3] = 9.
		 */
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[20];
		int indice = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = i * i;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
