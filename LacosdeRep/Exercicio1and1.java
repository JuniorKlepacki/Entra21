package LacosdeRep;

import java.util.Scanner;

public class Exercicio1and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa, utilizando for, em que o usuário tenha a opção de inserir
		 * dois valores e ocorra a subtração deles, deve ocorrer por 3 vezes.
		 */
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Escreava o primeiro número inteiro");
			int num = scan.nextInt();
			System.out.println("Escreva o segundo número inteiro ");
			int num2 = scan.nextInt();
			int result = (num - num2);
			System.out.println("A subtração deos numeros é igual " + result);
		}	
	}
}