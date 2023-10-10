package aulaVetor;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [] grupo = new int[5];
		int i =0;
		for (; i < 5; i++) {
			System.out.print("Digite o valor: ");
			grupo[i] = scanner.nextInt();		 
	}
		for (int f = 0; f < 5; f++) {
			System.out.println(grupo[f]);

}
	}
}