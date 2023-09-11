package aula7;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan= new Scanner(System.in);

		int numero = 0;
		while (numero < 6) {
			System.out.println(numero*2);
			numero++;
		}
		System.out.println("Informe valores");
		int entrada= scan.nextInt();
		
		while( entrada != 0 ) {
			System.out.println("Informe valores");
			entrada = scan.nextInt();
			
		}
	
		System.out.println("Informe uma letra ");
		char entrada2 = scan.next().charAt(0);
		
		 while (entrada2 != 'a') {
			 System.out.println("Informe uma letra");}
			 
		 System.out.println("Fimm");
		 }
		
		
		
	}


