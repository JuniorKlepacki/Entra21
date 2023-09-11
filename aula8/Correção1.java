package aula8;

import java.util.Scanner;

public class Correção1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char continuar = 's';
		double resultado = 0;
		{while (continuar != 'n') {
			System.out.print("Digite o primeiro número: ");
			double numero1 = scanner.nextDouble();
			System.out.print("Digite o segundo número: ");
			double numero2 = scanner.nextDouble();
			System.out.println("Escolha a operação:1 - Soma,2 - Subtração,3 - Multiplicação,4 - Divisão");
			int operacao = scanner.nextInt();

			switch (operacao) {
			case 1:
				resultado = numero1 + numero2;
				break;
			case 2:
				resultado = numero1 - numero2;
				break;
			case 3:
				resultado = numero1 * numero2;
				break;
			case 4:
				resultado = numero1 / numero2;
				break;
			default:
				System.out.println("Operação inválida!");
				break;
			}
			System.out.println("Resultado: " + resultado);
			System.out.print("Deseja continuar? digite n se não e qualquer outra letra para sim: ");
			continuar = scanner.next().charAt(0);
		}		
		System.out.println("Calculadora encerrada.");
	}
}
}