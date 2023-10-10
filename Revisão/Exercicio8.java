package Revisão;

public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
		 * metros e cresce 3 centímetros por ano.
		 * Construa um algoritmo que calcule e imprima quantos anos serão necessários
		 * para que Zé seja maior que Chico.
		 */
	    double alturaze = 1.10;
	    double alturaChico = 1.50;
	    int anos= 0 ;
	    
	    while (alturaze <= alturaChico) { // condição enquanto
            alturaChico += 0.02; //  cresce 2 centímetros por ano 
            alturaze += 0.03;    //  cresce 3 centímetros por ano 
            anos++;     // contador
        }

        System.out.println("Serão necessários " + anos + " anos para que Zé seja mais alto que Chico.");
    }
}