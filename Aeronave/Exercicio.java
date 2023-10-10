package Aeronave;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double maisPassageiros = Integer.MIN_VALUE;
		double maiorTemp = Integer.MIN_VALUE;
		double[] tanques = new double[4];
		double[] passageiro = new double[4];
		double[] queima = new double[4];
		double[] velomax = new double[4];
		double maisTveloMax = Integer.MIN_VALUE;
		double voaMais;
		int aux = 0;
		int auxPas = 0;
		double tempVeloMax = 0;
		int auxVelo = 0;
		for (int t = 0; t < tanques.length; t++) {
			System.out.println("Digite a capacidade do tanque de combustivel da aeronave " + (t + 1));
			tanques[t] = input.nextDouble();
		}
		for (int t = 0; t < queima.length; t++) {
			System.out.println("Digite a queima de combustivel da aeronave " + (t + 1) + " por minuto");
			queima[t] = input.nextDouble();
		}
		for (int i = 0; i < 4; i++) {
			voaMais = (tanques[i] / queima[i]);
			if (voaMais > maiorTemp) {
				maiorTemp = voaMais;
				aux = i + 1;
			}
		}
		System.out.println("A aeronave que fica mais tempo no ar é " + (aux) + " com cerca de " + maiorTemp);

		for (int i = 0; i < passageiro.length; i++) {
			System.out.println("Digite a quantidade de passageiros da aeronave " + (i + 1));
			passageiro[i] = input.nextDouble();
			if (passageiro[i] > maisPassageiros) {
				maisPassageiros = passageiro[i];
				auxPas = i;
			}
		}
		System.out.println("A aeronave que consegue levar mais passageiros é a " + (auxPas + 1) + " com a cap"
				+ "acidade de " + maisPassageiros);

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a velocidade máxima da aeronave " + (i + 1));
			velomax[i] = input.nextDouble();
		}
		for (int i = 0; i < 4; i++) {
			tempVeloMax = velomax[i] / (queima[i] / 60);
			if (tempVeloMax > maisTveloMax) {
				maisTveloMax = tempVeloMax;
				auxVelo = i + 0;
			}
		}
		System.out.println("A aeronava que mais percorre  na velocidade é a " + auxVelo + " com cerca de "
				+ maisTveloMax + " kilometros ");

	}
}