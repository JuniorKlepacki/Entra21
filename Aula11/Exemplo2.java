package Aula11;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[2][4];
		int soma = 0;
		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[0][3] = 40;
		matriz[1][0] = 50;
		matriz[1][1] = 60;
		matriz[1][2] = 70;
		matriz[1][3] = 80;
		// soma da coluna
		
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			System.out.println(matriz[0][coluna]);
			soma += matriz[0][coluna];
		}
		System.out.println("A soma é :" + soma);

	}

}
