package ExercicioOR_I_AND;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor da sua carta");
		int cart1 = entrada.nextInt();
		System.out.println("Informe o valor da sua segunda carta");
		int cart2 = entrada.nextInt();
		System.out.println("Informe o valor da sua terceira carta");
		int cart3 = entrada.nextInt();
		int contador = 0;
		// processo
		if (cart1 == 1 || cart1 == 3 || cart1 == 2) {
			contador++;
		}if (cart2 == 1 || cart2 == 3 || cart2 == 2) {
			contador++;
		}if (cart3 == 1 || cart3 == 3 || cart3 == 2) {
			contador++;
		}
		{if (contador == 1) {
				System.out.println("TRUCO");
			} else if (contador == 2) {
				System.out.println("SEISSS");
			} else if (contador == 3) {
				System.out.println("NOVE");
			} else {
				System.out.println("CORRE");
			}

		}
	}
} 
