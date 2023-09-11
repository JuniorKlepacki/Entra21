package aula7;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// Escreva um programa onde caso o usuÃ¡rio digite a letra 's' peÃ§a para informar
		// um nÃºmero e caso digite 'n' encerre o programa e por fim
		// a) escreva o menor valor
		// b) escreva o maior valor
		
		// entrada
		System.out.println("Informe uma opÃ§Ã£o");
		char opcao = entrada.next().charAt(0);
		// nÃºmero que o usuario digitarÃ¡ dentro do laÃ§o de repetiÃ§Ã£o
		int numero = 0;
		// variaveis auxiliares
		// pega o maior valor para uma variavel do tipo inteiro
		int menor = Integer.MAX_VALUE; // variavel auxiliar - valor
		// pega o menor valor para uma variavel do tipo inteiro
		int maior = Integer.MIN_VALUE;
		// debug - utilizamos para analisar o cÃ³digo
		// System.out.println(menor);
		// debug
		// System.out.println(maior);
		
		while(opcao == 's') {
			System.out.println("Informe um numero");
			numero = entrada.nextInt();
			// processo - comparando valor do usuario
			if(numero < menor) {
				menor = numero;
			}
			// debug
			// System.out.println("menor temp " + menor);
			if(numero > maior) {
				maior = numero;
			}
			// nÃ£o entrar em loop
			// opcao = 'n';
			System.out.println("Informe uma opcao");
			opcao = entrada.next().charAt(0);
			
			// melhor - predinha no cÃ³digo
			// utilizamos para caso o valor insira um valor invÃ¡lido 
			// e queremos valores vÃ¡lidos ('s') e ('n')
			while(opcao != 's' && opcao != 'n') { // sÃ³ sai desse while caso seja 
													// 's' ou 'n' 
				System.out.println("Valor invÃ¡lido");
				System.out.println("Informe de novo");
				opcao = entrada.next().charAt(0);
			}
			
		}
		// saida
		System.out.println("Menor " + menor);
		System.out.println("Maior " + maior);
		
		
	}

}
