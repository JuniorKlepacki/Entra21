package Exercicios;
import java.util.Scanner;

public class Exercicio1Condicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um númeror");
		
		int num1 = entrada.nextInt();
		if (num1>=0) {
			
			System.out.println("Seu número é positivo");
			} else {       
			System.out.println("Seu número é negativo");
			}
		}
		
	}