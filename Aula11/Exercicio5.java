package Aula11;

public class Exercicio5 {

	public static void main(String[] args) {

		char[][] matriz = new char[4][4];
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = '*';
			}
		}
		char[][] matriz2 = new char[4][4];
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				if (linha == 1 || linha == 2) {
					if (coluna == 1 || coluna == 2) {
						matriz2[linha][coluna] = ' ';
		} else {
			matriz2[linha][coluna] = '*';
		}
		} else {
		     matriz2[linha][coluna] = '*';
				}
			}
		}

		char[][] matriz3 = new char[4][4];
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				if (coluna > linha) {
					matriz3[linha][coluna] = ' ';
				} else {
					matriz3[linha][coluna] = '*';
				}
			}
		}
		System.out.println("Matriz Preenchida:");
		exibirMatriz(matriz);

		System.out.println("\nMatriz sem o meio:");
		exibirMatriz(matriz2);

		System.out.println("\nMatriz sem o triangulo direito");
		exibirMatriz(matriz3);
	}
	public static void exibirMatriz(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
