package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
	System.out.println("Escreva o turno que você estuda , sendo M-matutino, V-vespertino e N-noturno");
	String temp = entrada.next();
	

	if (temp.equals("M")) {
		System.out.println("Bom dia e boa aula"); }
	else if (temp.equals("V")) {
		   System.out.println("Boa Tarde e boa aula"); }
	else if (temp.equals ("N")) {
		System.out.println("Boa noite e boa aula");
	} else {
		 System.out.println("Valor invalido");
	}

			
	
	
	
	
	

	}

}
      