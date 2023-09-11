package aulaVetor;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Descreva um algoritmo que leia 12 valores reais e os coloque em um v etor de
		 * 12 posições do tipo real. Imprima quais valores desses informados são maiores
		 * que a média dos valores.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		double[] valores = new double[12];
		double soma = 0;

		// Lê os 12 valores reais e calcula a soma
		for (int i = 0; i < 12; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			valores[i] = scanner.nextDouble();
			soma += valores[i];
		}
		double media = soma / 12;
		System.out.println("Valores maiores que a média: ");
		for (int i = 0; i < 12; i++) {
			if (valores[i] > media) {
				System.out.println(valores[i]);
			}
		}
	}
}
