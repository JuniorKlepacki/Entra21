package Revisão;

import java.text.DecimalFormat;



public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = { { 2104, 3, 399900 },
				{ 1600, 3, 329900 }, 
				{ 2400, 3, 369000 }, 
				{ 1416, 2, 232000 },
				{ 3000, 4, 539900 }, 
				{ 1985, 4, 299900 }, 
				{ 1534, 3, 314900 },
				{ 1427, 3, 199000 },
                { 1380, 3, 212000 },
				{ 1494, 3, 242500 }, 
				{ 1940, 4, 240000 }, 
				{ 2000, 3, 347000 }, 
				{ 1890, 3, 330000 },
				{ 100, 5, 699900 },
				{ 1268, 3, 259900 } };
		double soma = 0;
		double menor = Integer.MAX_VALUE;
		double maior = Integer.MIN_VALUE;

		// fazer for para análise da matriz
		for (int linha = 0; linha < matriz.length; linha++) { // quantidade de linhas
			soma = soma + matriz[linha][2];
			double media = (soma) / matriz.length;
			System.out.println("Valor da casa : " + matriz[linha][2]);
			System.out.println(" Soma : " + soma);
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
			}
		}
		for (int linha = 0; linha < matriz.length; linha++) {
			if (matriz[linha][0] < menor) {
				menor = matriz[linha][2];
			}
			if (matriz[linha][2] > maior) {
				maior = matriz[linha][1];
			}
		}
		System.out.println("A menor casa custa : " + menor + " e a mais cara possui " + maior + " quartos");
		System.out.println("A média é : " + (soma / matriz.length));
	}
}
