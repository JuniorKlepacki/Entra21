package ExercicioOR_I_AND;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

     Scanner entrada= new Scanner (System.in);
		System.out.println("Escolha a operação desejada. de modo que 1 seja soma"
				+ "2 seja subtração . 3 multiplicação e 4 dividsao");
		int oper = entrada.nextInt();
	
		
		System.out.println(" Digite o seu primeiro numero");
		int num1= entrada.nextInt();
		System.out.println("Digite o seu segundo numero");
		int num2 = entrada.nextInt();
		
		//processo
		int soma= (num1+num2);
		int menos= (num1-num2);
		int mult= (num1*num2);
		int div= (num1/num2);
		
		if (oper ==1) {
			System.out.println ("O seu resulto é " + soma);
		} 
		else if (oper == 2) {
				System.out.println("O seu resulto é " + menos);
			}
	      else if (oper == 3) {
	   System.out.println("O seu resultado é"   + mult);
	}
			else if (oper == 3) {
						System.out.println("O seu resultado é"   + mult );
							}
						else  {
							System.out.println("Operação invalida");
							}
		}
	}

