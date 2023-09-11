package aula7;
import java.util.Scanner;
public class Exercicio7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// Escreva um programa onde caso o usuário digite a letra 's' peça para informar
		// um número e caso digite 'n' encerre o programa e por fim
		// a) escreva o menor valor
		// b) escreva o maior valor
		
		// entrada
		System.out.println("Informe uma opção");
		char opcao = entrada.next().charAt(0);
		
		// um número
		int numero = 0;
		int menor = Integer.MAX_VALUE; // variavel auxiliar - valor
		int maior = Integer.MIN_VALUE;
		
		
		while(opcao == 's') {
			System.out.println("Informe um número");
			numero = entrada.nextInt();
			// processo
			if(numero < menor) {
				menor = numero;
			}
			// debug
			// System.out.println("menor temp " + menor);
			if(numero > maior) {
				maior = numero;
			}
			// não entrar em loop
			// opcao = 'n';
			System.out.println("Informe uma opção");
			opcao = entrada.next().charAt(0);
			while (opcao != 's' && opcao != 'n')
				System.out.println("Valor invalido");
			System.out.println("Informe de novo");
			opcao = entrada.next().charAt(0);
			
		}
		// saida
		System.out.println("Menor " + menor);
		System.out.println("Maior " + maior);
		
		
	}

}