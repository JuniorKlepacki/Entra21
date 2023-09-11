package aulaVetor;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Crie uma array de 5 elementos e no momento de imprimir, comece pelo último
		// elemento até o primeiro elemento.

		Scanner scanner = new Scanner(System.in);
		int[] grupo = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite 5 números");
			grupo[i] = scanner.nextInt();

		}
		for (int i = 4; i >= 0; i--) {// ao contrario
			System.out.println(grupo[i]);

		}

	}
}