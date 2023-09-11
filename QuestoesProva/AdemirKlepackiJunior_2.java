package QuestoesProva;

import java.util.Scanner;

public class AdemirKlepackiJunior_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escreva um programa onde o usuário informa os dados dos lados de um triangulo
		 * depois verifique e retorne se ele é isóscele, escaleno ou equilátero.
		 */
		double lado = 0;
		double lado2 = 0;
		double lado3 = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a medida do lado1: ");
		lado = scanner.nextDouble();
		System.out.println("Informe a medida do lado2: ");
		lado2 = scanner.nextDouble();
		System.out.println("Informe a medida dos lado3o: ");
		lado3 = scanner.nextDouble();

		if (lado == lado2 && lado2 == lado3) {
			System.out.println("O seu triângulo é equilátero");
		} else if (lado == lado2 || lado2 == lado3 || lado3 == lado) {
			System.out.println("O seu triângulo é isósceles");
		} else {
			System.out.println("Seu triângulo é escaleno");
		}

	}

}
