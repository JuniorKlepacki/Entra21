package aulaVetor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que inverta a ordem de uma array (o primeiro elemento vai
		 * se tornar o último elemento)
		 */
		char[] vetor = { 'A', 'B', 'C', 'D', 'E', 'F' };

		int tamanho = vetor.length - 1; // percorre metade final
		// e o indice percorre a metade inicial
		char temp = ' ';
		System.out.println(Arrays.toString(vetor));
		for (int indice = 0; indice < tamanho;) { 
			// temp recebe um valor antes de ele ser alterado
			temp = vetor[indice];
			// valor do vetor Ã© alterado
			vetor[indice] = vetor[tamanho];
			// valor salvo pela temp passa a ser reatribuido
			vetor[tamanho] = temp;
			tamanho--;
			indice++;
		}

		System.out.println(Arrays.toString(vetor));
	}

}
