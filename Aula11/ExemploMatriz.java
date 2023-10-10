package Aula11;

public class ExemploMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[][] matriz = new String [3][3];
    
    matriz[0][0] = "Doritos";
    matriz[0][1]=  "3";
    matriz[1][0] = "Chocolate";
    matriz[1][1] = "9";
    matriz[2][0] = "Sushi";
    matriz[2][1] = "7";
    
		
	 System.out.println(matriz[1][0]+ " ganhou "   +matriz[1][1] + " votos" );
		
	 System.out.println(matriz[2][0]+ " ganhou "   +matriz[2][1] + " votos" );
	 
	 System.out.println(matriz[0][0]+ " ganhou "   +matriz[0][1] + " votos" );
	 
	 int[][] matriz2 = new int[4][3];
	 matriz2[0][0] = 5;
	 matriz2[0][1] = 1;
	 matriz2[0][2] = 2;
	 matriz2[1][0] = 10;
	 matriz2[1][1] = 6;
	 matriz2[1][2] = 7;
	 matriz2[2][0] = 15;
	 matriz2[2][1] = 11;
	 matriz2[2][2] = 12;
	 matriz2[3][0] = 20;
	 matriz2[3][1] = 16;
	 matriz2[3][2] = 17;
	 
	 double [][] matriz3 = new double[3][2];
	 
	 matriz3[0][0]=1.65;
	 matriz3[0][1]=33;
	 matriz3[1][0]=1.87;
	 matriz3[1][1]=12;
	 matriz3[2][0]=1.93;
	 matriz3[2][1]=18;
	
	 double soma = matriz3[2][0] + matriz3[1][0] + matriz3[0][0];
	  double media = soma / 3 ;
	 System.out.println("A média é: " + media );
	}
   
}
