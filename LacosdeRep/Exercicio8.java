package LacosdeRep;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * . Descreva um algoritmo que calcule e escreva a soma dos números pares e a
		 * soma dos números ímpares entre 1 e 1000.
		 */
		int contpar = 0;
		int contimpar = 0;
		for (int i = 0; i <= 1000; i++)
			if (i % 2 == 0) {
				contpar += i;
			} else {
				contimpar += i;
			}
		System.out.println("A soma dos números impares de 1 até 1000 é :" + contimpar);
		System.out.println("A soma dos números pares de 1 até 1000 é :" + contpar);

	}
}
