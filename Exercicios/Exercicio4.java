package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Faça um programa que verifique (usando if e else) se uma letra digitada 
é “F” ou “M”. Conforme a letra escrever: F – Feminino, M- Masculino, 
Sexo inválido.
 */       Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva seu sexo, digitando F para  feminino e M para masculino");
		String sex = entrada.next();
		

		if (sex.equals("F")) {
			System.out.println("Voce é mulher"); }
		else if (sex.equals("M")) {
			   System.out.println("Voce é homem"); }
		else {
			System.out.println("Sexo invalido");}
	
		
		
		
		
		
		
		
		
		
	}

}
