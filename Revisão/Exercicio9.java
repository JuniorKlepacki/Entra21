package Revisão;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/*
		 * Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de
		 * seus clientes. Trinta deles foram ouvidos e para cada um perguntou-se o sexo
		 * (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor
		 * inteiro) e a idade. Baseado nisto faça um programa que informe: qual a nota
		 * média recebida pelo cinema; qual a nota média atribuída pelos homens; qual a
		 * nota atribuída pela mulher mais jovem; quantas das mulheres com mais de 50
		 * anos deram nota superior a média recebida pelo cinema.
		 */
		Scanner scanner = new Scanner(System.in);
		int totalClientes = 30;
		int somaNotas = 0;
		int somaNotasHomens = 0;
		int notaMulherMaisJovem = Integer.MAX_VALUE; // Inicializado com um valor alto para encontrar o mínimo.
		int contadorMulheresMais50 = 0;

		for (int i = 1; i <= totalClientes; i++) {
			System.out.println("Cliente " + i);

			System.out.print("Informe o sexo (1=feminino, 2=masculino): ");
			int sexo = scanner.nextInt();

			System.out.print("Informe a nota (de 0 a 10, valor inteiro): ");
			int nota = scanner.nextInt();

			System.out.print("Informe a idade: ");
			int idade = scanner.nextInt();

			somaNotas += nota;

			if (sexo == 2) { // Se for homem
				somaNotasHomens += nota;
			}

			if (sexo == 1 && idade < notaMulherMaisJovem) { // Se for mulher e mais jovem
				notaMulherMaisJovem = nota;
			}

			if (sexo == 1 && idade > 50 && nota > (somaNotas / totalClientes)) { // Se for mulher, mais de 50 anos e
																					// nota acima da média
				contadorMulheresMais50++;
			}
		}

		double notaMediaCinema = (double) somaNotas / totalClientes;
		double notaMediaHomens = (double) somaNotasHomens / (totalClientes / 2);

		System.out.println("Nota média recebida pelo cinema: " + notaMediaCinema);
		System.out.println("Nota média atribuída pelos homens: " + notaMediaHomens);
		System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
		System.out.println("Mulheres com mais de 50 anos que deram nota superior à média: " + contadorMulheresMais50);
	}
}