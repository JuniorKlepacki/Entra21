package Exercicios;
import java.util.Scanner;

public class Exercicio2Condicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe valor 1");
		int valorUm = entrada.nextInt();
		
		
	
		
		if (valorUm % 2 == 0) {
			// saida
			System.out.println("O Valor apresentado é par"); // verdadeiro
		} else {
			// saida
			System.out.println("O Valor apresentado é ímpar"); 
		}
	}
}
		
	
