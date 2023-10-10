 package Revisão;

import java.util.Scanner;



public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * O índice de massa corporal (IMC) é uma medida internacional usada para
		 * calcular se um pessoa está no peso ideal. O IMC é determinado pela divisão da
		 * massa do indivíduo pelo quadrado de sua altura, onde a massa está em
		 * quilogramas e a altura está em metros, de acordo com a fórmula:
		 * 
		 * IMC = Massa / Altura² Faça um algoritmo para classificar o IMC e dizer o grau
		 * de obesidade do indivíduo, de acordo com a seguinte tabela: < 18.5 Magreza
		 * 18.5 – 24.9 Saudável 25.0 – 29.9 Sobrepeso 30.0 – 34.9 Obesidade Grau I 35.0
		 * – 39.9 Obesidade Grau II (severa) > 40.0 Obesidade Grau III (morbida)
		 */
		Scanner scanner = new Scanner(System.in);
		double peso = 0;
		double altura = 0;
		System.out.println("Digite sua altura em metros");
		altura = scanner.nextDouble();
		System.out.println("Informe o seu peso");
		peso = scanner.nextDouble();

		double imc = peso / (altura * altura);
		System.out.println("O seu imc é " + imc);

		if (imc < 18.5) {
			System.out.println("Magro");
		} else if (imc == 18.5 && imc > 24.9) {
			System.out.println("Você é saudavel");
		} else if (imc == 25 && imc > 29.9) {
			System.out.println("Você está com sobrepeso");
		} else if (imc == 30 && imc > 34.9) {
			System.out.println(" Você está com Obesidade Grau I");
		} else if (imc == 35 && imc > 39.9) {
			System.out.println("Você está com Obesidade Grau II");
		} else if (imc > 40) {
			System.out.println("Você está com Obesidade Grau III");

		}

	}
}