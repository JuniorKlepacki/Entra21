package Aula11;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*Crie um programa onde o usuário define quantas linhas e colunas deve ter 
		 * uma matriz, e 
		 * posteriormente imprima o total de elementos(posições) que está matriz tem
		 */
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Digite a quantidade de linhas e posteriormente"
		 		+ " a quantidade de colunas:");
		 int linha = scanner.nextInt();
		 int coluna = scanner.nextInt();
		 
		 System.out.println("Esta matriz possui as seguintes proporções : matriz ["
		 		+ linha + "] [" +coluna+ "]" );
		 
		 int elementos= linha * coluna;
		 
		 System.out.println("\nA matriz possui "  + elementos + " elementos ");
		 
	
	}
	
	
}
