package aulaVetor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		double[] notas = new double[3];
		double media = 0;

		System.out.println("Digite 3 números");
		notas[0] = scanner.nextInt();
		notas[1] = scanner.nextInt();
		notas[2] = scanner.nextInt();
		double soma = notas[0] + notas[1] + notas[2];
		media= soma /3;
		System.out.println("A media é " +media);
		
	}
}
