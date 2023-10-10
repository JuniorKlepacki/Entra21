package Container;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu

		List<Integer> numbers = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			int aux = 0;
			Random random = new Random();
			aux = random.nextInt(100);
			numbers.add(aux);
		}
		System.out.println(numbers);
		System.out.println("Digite o indice que deseja substituir por  0");
		int op = input.nextInt();
		numbers.add(op, 0);
		numbers.remove(op + 1);
		System.out.println(numbers);
	}

}
