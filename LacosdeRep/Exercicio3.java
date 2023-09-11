package LacosdeRep;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crie 4 variáveis fora do For onde define se é m(mulher) e h(homem) e faça
		 * dois contador que verifique quantas mulheres e homens são
		 */
		Scanner scan = new Scanner(System.in);
		int contadorMulheres = 0;
		int contadorHomens = 0;
		for (int i = 0; i <= 4; i++) {
			System.out.println("Escreva o gênero");
			String pessoas = scan.next();
			if (pessoas.equals("m")) {
				contadorMulheres = +contadorMulheres + 1;
			} else if (pessoas.equals("h")) {
				contadorHomens = +contadorHomens + 1;
			}
		}

		System.out.println("Quantidade de mulheres: " + contadorMulheres);
		System.out.println("Quantidade de homens: " + contadorHomens);
	}
}