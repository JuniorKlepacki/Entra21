package ExercicioOR_I_AND;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um 
algoritmo para ler as idades dos filhos e exibir quem é o mais velho, o 
irmão do meio e o caçula da família. Suponha que não haja empates.
 */
		Scanner entrada = new Scanner(System.in);
		String filho1 = "Marquinhos";
		String filho2 = "Zezinho";
		String filho3 = "Luluzinha";
		
		
	    System.out.println("Escreva a idade do Marquinhos ");
	    int son1 = entrada.nextInt();
	    System.out.println("Escreva a idade do Zezinho ");
	    int son2 = entrada.nextInt();
	    System.out.println("Escreva a idade da Luluzinha ");
	    int son3 = entrada.nextInt();
	
	    if (son1 >=son2 && son1 >son3) {
		   System.out.println("O filho mais velho é o "  +filho1);
         }else if (son2 >=son3) {
        	 System.out.println(" O filho mais velho é o "  +filho2 );
         } else {
        	 System.out.println("A filha mais velha é a " +filho3);
         }        	 
	   }

}
