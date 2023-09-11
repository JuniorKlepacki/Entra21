package aulaVetor;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um algoritmo em que quem preenche os valores do vetor é o usuário,
		// por fim printe o vetor (vetor de 5 posições).
		Scanner scanner = new Scanner(System.in);
		String[] grupo = new String[5];
		for (int i = 0; i < grupo.length; i++) {
			System.out.println("Digite 5 números");
			grupo[i] = scanner.next();

		}
		for (int f = 0; f < 5; f++) {
			System.out.println(grupo[f]);

		}	}
}