package AulaClasses;

import java.util.Scanner;

public class Questao2Funcao {
	/*
	 * Faça um código que receba duas entradas do usuário
	 * 
	 * Printe cada entrada ao cubo se: Algum dos dois números for 5 A soma deles é 5
	 * A diferença deles é 5
	 * 
	 * Se nenhuma dessas condições forem satisfeitas, printe cada entrada ao
	 * quadrado
	 * 
	 * 
	 * 
	 */
	public static String entrada(int num1 , int num2){
		double cubo= num1*num1*num1;
		double cubo2 = num2*num2*num2;
	    double quad1=num1*num1;
	    double quad2=num2*num2;
		
		if (num1 == 5 || num2 == 5 || num1+num2 == 5 || num1-num2 == 5 || num2-num1 ==5) {
			
			return  "o cubo dos resultados é :" +cubo+ "e " +cubo2;
		} else {
		      return " o quadrado dos resultados é :" + quad1 +  " e " + quad2; 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
         System.out.println("Digite o primeiro numero");
         int num1 = input.nextInt();
         System.out.println("Digite o segundo numero");
         int num2 = input.nextInt();
         
         System.out.println(entrada(num1,num2));
		
		
		
	}

}
