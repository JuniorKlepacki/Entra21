package Container;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Faça um algoritmo em que o usuário
		// insere um número em um índice específico que ele mesmo informou
		List<Integer> numbers = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			int aux = 0;
			Random random = new Random();
			aux = random.nextInt(100);
			numbers.add(aux);
		}
		System.out.println(numbers);
		System.out.println("Digite o indice que deseja substituir (até 10 )");
		int op = input.nextInt();
		System.out.println("Digite o numero que deseja inserir");
		int num = input.nextInt();
		numbers.add(op, num);
		numbers.remove(op + 1);
		System.out.println(numbers);
	}

}
