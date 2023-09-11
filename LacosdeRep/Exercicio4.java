package LacosdeRep;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double entrada;
		double soma = 0;
			for (int i = 0; i <= 1; i++) {
			
	
			System.out.println("Informe a sua nota");	
			entrada = scan.nextDouble();
			soma += entrada ; 
			//processo
			double media = soma / 3;
			System.out.println("A sua média é :"  + media);
		
		}	}}
