package aulaVetor;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
     /*4. Crie uma array de 5 elementos e descubra: 

       a) Qual o maior elemento 
       b) Qual o menor elemento 
       c) A média dos elementos
      */
		Scanner scanner = new Scanner(System.in);
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		double soma = 0;
	    int[] grupo = new int [5];
		for (int i = 0; i < grupo.length; i++) {
			System.out.println("Digite 5 números");
			grupo[i] = scanner.nextInt();
			soma = (soma+grupo[i]);
			if (grupo[i]> maior ) {
				maior = grupo[i];}
		 if( grupo[i] < menor) {
			 menor = grupo[i];}
     
		}
		  double media =soma / grupo.length;
		
		
  System.out.println("maior " + maior);
  System.out.println("menor " + menor);
  System.out.println("A média é " +   media);
}
}