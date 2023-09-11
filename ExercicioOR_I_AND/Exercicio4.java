package ExercicioOR_I_AND;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua idade ");
		int idad = entrada.nextInt();
		if (idad >= 5 && idad <= 7) {
			System.out.println("O nadador é da categoria pré-mirim");
		} else if (idad >= 8 && idad <= 10) {
			System.out.println("O nadador é da categoria mirim");
		} else if (idad >= 11 && idad <= 13) {
			System.out.println("O nadador é da categoria infantil");
		} else if (idad >= 14 && idad <= 17) {
			System.out.println("O nadador é da categoria infanto-juvenil");
		} else if (idad >= 18 && idad <= 20) {
			System.out.println("O nadador é da categoria juvenil");
		} else if (idad > 21) {
			System.out.println("O nadador é da categoria adulto");
		} else {
			System.out.println("Voce não nada");
		}

	}

}
