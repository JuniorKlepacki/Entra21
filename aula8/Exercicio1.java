package aula8;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * . Faça uma calculadora. O usuário entra com dois números e depois com a
		 * operação desejada. Caso o número da operação seja 1: some os dois números.
		 * Caso seja 2: subtraia os dois números. Caso seja 3: multiplique os dois
		 * números. Caso seja 4: divida os dois números. Após realizada a operação,
		 * solicite ao usuário se desej a continuar realizando operações (sempre com
		 * dois novos valores) digite qualquer tecla e caso queira encerrar informe a
		 * letra ‘n’.
		 */
		Scanner scanner = new Scanner(System.in);
		char continuar = 's';

		{
			System.out.print("Digite o primeiro número: ");
			double numero1 = scanner.nextDouble();
			System.out.print("Digite o segundo número: ");
			double numero2 = scanner.nextDouble();
			System.out.println("Escolha a operação:1 - Soma,2 - Subtração,3 - Multiplicação,4 - Divisão");
			int operacao = scanner.nextInt();

			double resultado = 0;

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
		while (continuar != 'n') {
			System.out.print("Digite o primeiro número: ");
			double numero1 = scanner.nextDouble();
			System.out.print("Digite o segundo número: ");
			double numero2 = scanner.nextDouble();
			System.out.println("Escolha a operação:1 - Soma,2 - Subtração,3 - Multiplicação,4 - Divisão");
			int operacao = scanner.nextInt();

			double resultado = 0;
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
		while (continuar != 'n')
			;
		System.out.println("Calculadora encerrada.");
	}
}