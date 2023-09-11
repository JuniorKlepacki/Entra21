package ExercicioOR_I_AND;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("você pode doar sangue!");
        } else {
            System.out.println("você não pode doar sangue");
        }
   }
}
