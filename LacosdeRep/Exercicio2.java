package LacosdeRep;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva um número");
		int num = scan.nextInt();
		System.out.println("Numeros  impares até " + num + ":");
		for (int i = 1; i <= num; i += 2) {
			System.out.println(i);

		}

	}
}
