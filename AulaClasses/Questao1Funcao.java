package AulaClasses;

import java.util.Scanner;

public class Questao1Funcao {
	/*
	 * Faça um programa que diz se um número inserido está dentro de um limite
	 * imposto pelo usuário
	 * 
	 * Por exemplo:
	 * 
	 * Usuário inseriu o limite máximo como 100. Usuário inseriu o limite mínimo
	 * como 70.
	 * 
	 * Depois ele inseriu o número 80.
	 * 
	 * A saída deve ser: 80 está nos limites impostos.
	 * 
	 * 
	 */

	public static String limite(double numeroInserido, double limiteMin, double limiteMax) {

		if (numeroInserido > limiteMin && numeroInserido < limiteMax) {
			return numeroInserido + "esta nos limites ";
		} else {
			return "não esta nos limites";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o limite Máximo");
		int limiteMax = input.nextInt();
		System.out.print("Digite o limite Mínimo ");
		int limiteMin = input.nextInt();
		System.out.println("Digite um número : ");
		double numeroInserido = input.nextInt();

		System.out.println(limite(numeroInserido, limiteMin, limiteMax));

	}

}
