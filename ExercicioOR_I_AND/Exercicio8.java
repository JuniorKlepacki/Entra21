package ExercicioOR_I_AND;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva a idade da mulher mais velha\n");
		int idadeM1 = entrada.nextInt();
		System.out.println("Escreva a idade da mulher mais nova\n");
		int idadeM2 = entrada.nextInt();
		System.out.println("Escreva a idade do homen mais velho\n");
		int idadeH1 = entrada.nextInt();
		System.out.println("Escreva a idade do homen mais novo\n");
		int idadeH2 = entrada.nextInt();

		// soma das idades do homem mais velho com a mulher mais nova,

		int soma = (idadeH1 + idadeM2);
		// produto das idades do homem mais novo com a mulher mais velha.

		int prod = (idadeH2 * idadeM1);

		System.out.println("\n A soma da idades do homem mais velho com a mulher mais nova é \n"
		+ soma);

		System.out.println("\n O produto das idades  do homem mais novo com a mulher mais velhp é \n"
		+ prod);

	}

}
