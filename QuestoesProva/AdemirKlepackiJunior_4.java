package QuestoesProva;

import java.util.Scanner;

public class AdemirKlepackiJunior_4 {

	public static void main(String[] args) {

		// entrada
		Scanner scanner = new Scanner(System.in);
		double not1 = 0;
		double not2 = 0;
		double not3 = 0;
		double media = 0;
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int num = 0;
		char  op ;
		char gmail;
		char nome;
		int aux= 0;
       
		System.out.println("Deja iniciar? 0 encerra");
		op= scanner.next().charAt(0);
		
		while (op != 0) {
			System.out.println("Deja encerrar?");
			op= scanner.next().charAt(0);
			aux++;
		System.out.println("Digite a primeira nota ");
		not1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota ");
		not2 = scanner.nextDouble();
		System.out.println("Digite a terceira nota ");
		not3 = scanner.nextDouble();

		media = (not1 + not2 + not3) / 3;
		System.out.println("A sua média é: " + media);

		System.out.println("Insira seu nome ");
		nome = scanner.next().charAt(0);
		System.out.println("Insira seu e-mail: ");
		gmail = scanner.next().charAt(0);
	int valor = 0;
		for (int i = 0; i<5; i++) {
			System.out.println("Informe um valor");
			valor= scanner.nextInt();
			if (valor > maior ) {
				maior = valor;}
		 if( valor < menor) {
			 menor = valor;}
	 
		}
		System.out.println("Menor:" +menor);
		System.out.println("Maior:" +maior);
				
        }
	
	System.out.println("Numero de tentativas validas " + aux);
			}
		
	}

