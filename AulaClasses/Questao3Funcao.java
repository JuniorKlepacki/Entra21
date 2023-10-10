package AulaClasses;

import java.util.Scanner;

public class Questao3Funcao {
	
	public static double calculo (double lado1 , double base ) {
		double perimetro = (base + base) + (lado1+lado1);
		return perimetro;
	}
	public static double area(double lado1 , double base ) {
		double area = base *lado1;
		return area;
	}
	

	public static void main(String[] args) {
		/*
		 * Faça um programa que calcule o perímetro e a área de um retângulo.
		 * Retornar os valores calculados
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a base do retangulo");
		double base = input.nextDouble();
		System.out.println("Digite a altura do retangulo");
		double lado1 = input.nextDouble();
		
		
		
		System.out.println(calculo(lado1,base));
		System.out.println(area(lado1,base));
		
	}

}
