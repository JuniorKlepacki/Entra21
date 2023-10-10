package Aula11;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * . Criar uma matriz com 1 linha e 10 colunas, na mesma verifique quantos
		 * valores são par e quantos valores são impar e calcule a média dos valores
		 */
		int[][] matriz = new int[2][10];
		int soma = 0;
		int soma2 = 0;
		double media = 0;
		int par = 0;
		int impar = 0;
		int somatotal = 0;
		matriz[0][0] = 2;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		matriz[0][4] = 5;
		matriz[0][5] = 6;
		matriz[0][6] = 7;
		matriz[0][7] = 8;
		matriz[0][8] = 9;
		matriz[0][9] = 10;
		matriz[1][0] = 2;
		matriz[1][1] = 2;
		matriz[1][2] = 3;
		matriz[1][3] = 4;
		matriz[1][4] = 5;
		matriz[1][5] = 6;
		matriz[1][6] = 7;
		matriz[1][7] = 8;
		matriz[1][8] = 9;
		matriz[1][9] = 10;

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			soma += matriz[0][coluna];

			if (matriz[0][coluna] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			for (int linha = 0 ; linha <2 ; linha ++) {
				System.out.println(matriz[linha][0]);
			 }

		}
		// Agora criem uma segunda linha e novamente somem todas as colunas,
		// por fim somem os valores da linho 0 e da linha 1
		for (int colunal1 = 0; colunal1 < matriz[1].length; colunal1++) {
			soma2 += matriz[1][colunal1];
			media = soma / 10;
			somatotal = soma + soma2;

		}
		System.out.println("Números pares : " + par);
		System.out.println("Números impares : " + impar);
		System.out.println("A média é : " + media);
		System.out.println("A soma da linha 2 : " + soma2);
		System.out.println("Soma das colunas das duas linhas : " +  somatotal);
	}
}
