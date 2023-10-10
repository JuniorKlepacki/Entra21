package Exercicio5;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		 


		Contribuinte c1 = new Contribuinte("Henrique", "515", "SC", 200000); // Criacao dos objetos de Contribuinte
		Contribuinte c2 = new Contribuinte("JosÃ©", "5615", "PR", 9000);
		Contribuinte c3 = new Contribuinte("Marcos", "965261", "RS", 2000);
		Contribuinte c4 = new Contribuinte("Ana", "841", "SC", 25000);
		Scanner input = new Scanner(System.in);

		System.out.println("Qual o seu nome?");
		String nome = input.next();

		System.out.println("Qual seu cpf");
		String cpf = input.next();

		System.out.println("De que estado vocÃª Ã©");
		String uf = input.next();

		System.out.println("Quanto vocÃª ganha");

		double rendaAnual = input.nextDouble();
		Contribuinte c5 = new Contribuinte(nome, cpf, uf, rendaAnual); // Criacao do objeto com Scanner
		Contribuinte vetor[] = new Contribuinte[5];
		vetor[0] = c1;
		vetor[1] = c2;
		vetor[2] = c3;
		vetor[3] = c4;
		vetor[4] = c5;

		double somaImposto = 0;

		double maiorImposto = Integer.MIN_VALUE;
		int iMaiorImposto = 0;
		double menorImposto = Integer.MAX_VALUE;
		int iMenorImposto = 0;

		for (int i = 0; i < vetor.length; i++) {
			somaImposto += vetor[i].calcularIRPF();

			if (vetor[i].calcularIRPF() > maiorImposto) {// Comparacao maior
				maiorImposto = vetor[i].calcularIRPF();
				iMaiorImposto = i;
			}

			if (vetor[i].calcularIRPF() < menorImposto) {// Comparacao menor
				menorImposto = vetor[i].calcularIRPF();
				iMenorImposto = i;
			}
		}

		System.out.println("Quem mais paga imposto Ã© o " + vetor[iMaiorImposto].toString());
		System.out.println("Quem menos paga imposto Ã© o " + vetor[iMenorImposto].toString());
		System.out.println("A soma dos imposto Ã© de R$" + somaImposto);
	}

}
