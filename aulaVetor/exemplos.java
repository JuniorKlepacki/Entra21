package aulaVetor;

import java.util.Scanner;

public class exemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] idades = new int[4];
		idades[0] = 16;
		idades[1] = 19;
		idades[2] = 29;
		idades[3] = 12;
		Scanner scanner = new Scanner(System.in);

		System.out.println(idades[0]);

		int[] grupo = new int[7];
		grupo[0] = 16;
		grupo[1] = 18;
		grupo[2] = 19;
		grupo[3] = 17;
		grupo[4] = 18;
		grupo[5] = 17;
		grupo[6] = 20;
		System.out.println(grupo[0]);
		System.out.println(grupo[6]);

		int soma = grupo[0] + grupo[1] + grupo[2] + grupo[3] + grupo[4] + grupo[5] + grupo[6];
		double media = (grupo[0] + grupo[1] + grupo[2] + grupo[3] + grupo[4] + grupo[5] + grupo[6]) / 7;
		System.out.println(soma);
		System.out.println("media " + media);

		for (int i = 0; i < 7; i++) {
			System.out.println(grupo[i]);
		}
		String[] nomes = new String[7];
		nomes[0] = "junior";
		nomes[1] = "ademir";
		nomes[2] = "klepacki";
		nomes[3] = "miguel";
		nomes[4] = "arthur";
		nomes[5] = "luiz";
		nomes[6] = "pedro";

		for (int f = 0; f < 7; f++) {
			System.out.println(nomes[f]);
		}
		System.out.println("Digite os nomes");
		String[] grupos = new String[21];

		for (int y = 0; y < 21; y++) {
			grupos[y] = scanner.next();
		}
		for (int i = 0; i < 21; i++) {
			System.out.println(grupos[1]);

		}

	}

}
