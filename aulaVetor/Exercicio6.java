package aulaVetor;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Crie um array de elementos e depois peça ao usuário para informar um valor,
		 * verifique se este valor está presente no array e printe o índice.
		 */
		int[] grupo = new int[10];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < grupo.length; i++) {
			System.out.println("Digite 10 números");
			grupo[i] = scanner.nextInt();

			System.out.println("Informe um valor");
			int num = scanner.nextInt();
			boolean possuiElemento = false;
			if (num == grupo[i]) {
				possuiElemento = true;
				System.out.println("Esse número está presente no array" + i);
			}
			if (possuiElemento == false) {
				System.out.println("Não tem");
			}
		}
	}
}
