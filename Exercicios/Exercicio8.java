package Exercicios;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner;

		public class Exercicio8 {
			public static void main(String[] args) {
				Scanner entrada = new Scanner(System.in); // uma vez por arquivo
				/*
				 * Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
				 * Para isto ela entregou um valor em dólares para o 
				 * atendente. Calcule quantos reais o atendente deve devolver 
				 * para a pessoa.
				 */
				
				//entrada - o valor em dolares
				System.out.println("Digite o valor");
				double valorEmDolares = entrada.nextDouble();
				
				double dolar = 4.97;
				
				// processo - Calcule quantos reais o atendente deve devolver para a pessoa
				double troca = valorEmDolares * dolar;
				
				// saida
				System.out.println("O total em reais é " + troca);
	}

}
