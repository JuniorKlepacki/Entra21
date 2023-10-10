package Container;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que remova o valor do meio da ArrayList. Caso a array list
		 * tenha tamanho par, remova o valor da segunda metade. Por exemplo: Em uma
		 * ArrayList de tamanho 6, remova o valor no índice 4
		 */
		List<Integer> teste = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.println("Digite o tamanho da sua lista");
		int tamanho = input.nextInt();

		for (int i = 0; i < tamanho; i++) {
			int aux = 0;
			Random random = new Random();
			aux = random.nextInt(100);
			teste.add(aux);
		}
		System.out.println(teste);
		if (tamanho % 2 == 0) {
			System.out.println("A lista possui uma quantidade par");
			teste.remove(tamanho / 2);
			System.out.println(teste);
		} else {
			System.out.println("A lista possui uma quantidade impar");
		}
	}

}
