package ExercicioOR_I_AND;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
     System.out.println("Digite o preço do primeiro produt :");
     double preco1 = entrada.nextDouble();
     System.out.println("Digite o preço do segundo produto");
     double num2 = entrada.nextDouble();
     System.out.println("Digite o preço do segundo produto");
     double preco3 = entrada.nextDouble();
     
    // processo
     if(preco1 == num2 || num2 == preco3 || preco3==preco1) {
    	 System.out.println("Os valores são iguais");
     } else {
    	  
    	 if ( preco1 <= num2 && preco1 <= preco3) {
    	    	 System.out.println(" O produto mais barato é o primeiro.");
    	     } else if (num2 <= preco3){
    	    	 System.out.println(" O produto mais barato é o segundo.");
    	     } else  { 
    	          System.out.println(" O produto mais barato é o terceiro.");
    	     }
    	     
    	     }
    	     
    		}
}
	
	


