package QuestoesProva;

import java.util.Scanner;

public class AdemirKlepackiJunior_1 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa onde o usuário informa um valor e a opção desejada do que
		 * deve ser feito com o valor, sendo as opções 1-converter de dólar para real e
		 * 2-converter de real para dólar, qualquer outra opção é considerada entrada
		 * inválida.
		 */
		double money = 0;
		double convert = 0;
		int op = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um valor");
		money = scanner.nextDouble();

		System.out.println("Digite 1 p/ converter de dólar para real  ou 2 p/ converter de real para dólar ");
		op = scanner.nextInt();

		switch (op) {
		case 1:
			convert = (money * 4.97);
			System.out.println("A sua conversão é " + convert);
			break;
		case 2:
			convert = (money / 4.97);
			System.out.println("A sua conversão é " + convert);

		default:
			System.out.println("Opção inválida");
			break;
		}

	}

}
