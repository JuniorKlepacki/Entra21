package QuestoesProva;

import java.util.Scanner;

public class AdemirKlepackiJunior_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escreva um programa onde o usuário leia altura de 10 pessoas diferentes e
		 * depois calcule a média.
		 */
		Scanner scanner = new Scanner(System.in);
		double soma = 0;
		double altura = 0;
		double media = 0;
		int aux = 0;
		int i = 0;

		while (i != 10) {
			System.out.println("Digite as 10 alturas ");
			altura = scanner.nextDouble();
			i++;
			soma = +soma + altura;
			media = soma / i;
		}

		System.out.println("A média das alturas é :" + media);
	}

}
