package Container;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Crie uma Array List O usuário vai colocando valores decimais até ele colocar
		 * o número 0. Calcular: a) Qual o menor número b) Qual o maior número Calcular
		 * a média
		 */
		double maiorNum = Integer.MIN_VALUE;
		double menorNum = Integer.MAX_VALUE;
		double op =1;
		double number;
		double soma = 0;
		
		List<Double> numeros = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Digite qualquer numero para iniciar e 0 para encerrar");
		op = input.nextDouble();
		
		while (op != 0) {
	
			System.out.println("Digite um numero decimal");
			number = input.nextDouble();
			numeros.add(number);
			soma += number;
			    if (number > maiorNum) {
				maiorNum = number;
			}
			    if (number < menorNum) {
				menorNum = number;
			}
			    System.out.println("Digite qualquer numero para iniciar e 0 para encerrar");
				op = input.nextDouble();
		}
		System.out.println(numeros);
		System.out.println("O maior número é : " + maiorNum);
		System.out.println("\n O menor número é " + menorNum);
 		System.out.println("\n A media dos numeros é " + (soma / numeros.size()));
        System.out.println("Fim");
	}

}
