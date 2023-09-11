package ExercicioOR_I_AND;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o ano de seu nascimento ");
		int idad = entrada.nextInt();
		System.out.println("Escreva o ano do nascimento da segunda pessoa");
		int idad2 = entrada.nextInt();
		System.out.println("Escreva o ano do nascimento da terceira pessoa");
		int idad3 = entrada.nextInt();

		// processo

		if (idad == idad2 && idad2 == idad3 && idad3 == idad) {
			System.out.println("Voces sao trigemeos ");
		} else if (idad == idad2 || idad2 == idad3 || idad == idad3) {
			System.out.println("Voces são gemeos ");
		} else {
			System.out.println("Voces são somente irmãos ");
		}
	} 

}
