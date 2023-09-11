package aulaVetor;

import java.util.Scanner;

public class ExercicioPt1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// posição do vetor = indice
		int[] valores = new int[100] ;
	// atribui valores (de posicoes) e diminui o codio
		for (int indice = 0; indice <1400; indice++) {
			valores[indice] = indice * indice ; 
		}
		
		
	    for(int i=0;i<100; i++) {
	         System.out.println("Quadrados dos indices " +  valores[i]);
	         
	         
	    }

	}

}
