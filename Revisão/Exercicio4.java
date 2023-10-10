package Revisão;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Crie uma array de 5 elementos e descubra:
		 * 
		 * a) Qual o maior elemento
		 * 
		 * b) Qual o menor elemento
		 * 
		 * c) A média dos elementos
		 */
		double[] numeros = new double[5];

		double menor = Integer.MAX_VALUE;
		double maior = Integer.MIN_VALUE;

		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		double soma = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];

		for (int f = 0; f < 5; f++) {
			System.out.println(numeros[f]);

			if (numeros[f] < menor) {
				menor = numeros[f];
			}
			if (numeros[f] > maior) {
				maior = numeros[f];
			}

		}
		System.out.println();
		double media = soma / 5;

		System.out.println("O maior número é : " + maior);
		System.out.println("O menor número é : " + menor);
		System.out.println("A média dos elementos é " + media);
	}
}