package AulaClasses;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		/*
		 * c) Qual das lojas teve o maior lucro nesse ano específico? d) Qual das lojas
		 * teve o menor lucro? e) Qual das lojas ficou no "meio" em termos de lucro?
		 */
		Scanner input = new Scanner(System.in);
		Mercada Blumenau = new Mercada();
		Mercada Joinville = new Mercada();
		Mercada Florianopolis = new Mercada();
		double maiorLucro = Integer.MIN_VALUE;
		double menorLucro = Integer.MAX_VALUE;
		double lucroMeio;
		Blumenau.precoMaca = 1.50;
		Florianopolis.precoMaca = 1.50;
		Joinville.precoMaca = 1.50;
		Blumenau.precoLaranja = 0.95;
		Florianopolis.precoLaranja = 0.95;
		Joinville.precoLaranja = 0.95;

		// entrada
		System.out.println("Digite a quantidade de maças vendidas em blumenau");
		Blumenau.maca = input.nextInt();// para pegar a quantidade
		Blumenau.lucroMacas = Blumenau.maca * Blumenau.precoMaca; // calcular lucro

		System.out.println("Digite a quantidade de maças vendidas em Floripa");
		Florianopolis.maca = input.nextInt();
		Florianopolis.lucroMacas = Florianopolis.maca * Blumenau.precoMaca;

		System.out.println("Digite a quantidade de maças vendidas em Joinvile");
		Joinville.maca = input.nextInt();
		Joinville.lucroMacas = Joinville.maca * Joinville.precoMaca;

		// laranjas
		System.out.println("Digite a quantidade de laranjas vendidas em Blumenau");
		Blumenau.laranja = input.nextInt();
		Blumenau.lucroLaranjas = Blumenau.precoLaranja * Blumenau.laranja;

		System.out.println("Digite a quantidade de laranjas vendidas em Florianopolis");
		Florianopolis.laranja = input.nextInt();
		Florianopolis.lucroLaranjas = Florianopolis.laranja * Blumenau.precoLaranja;

		System.out.println("Digite a quantidade de laranjas vendias em Joinvile");
		Joinville.laranja = input.nextInt();
		Joinville.lucroLaranjas = Joinville.laranja * Blumenau.precoLaranja;

		// Quem teve o maior lucro vendendo maçãs?
		if (Blumenau.lucroMacas > Florianopolis.lucroMacas && Blumenau.lucroMacas > Joinville.lucroMacas) {
			System.out.println("Blumenau obteve o maior lucro com a venda de maças ");
		} else if (Florianopolis.lucroMacas > Joinville.lucroMacas) {
			System.out.println("Floripa obteve o maior lucro com a venda de maças ");
		} else {
			System.out.println("Joinville obteve o maior lucro com a venda de maças");
		}
		// Quem teve o maior lucro vendendo laranjas?
		if (Blumenau.lucroLaranjas > Florianopolis.lucroLaranjas && Blumenau.lucroLaranjas > Joinville.lucroLaranjas) {
			System.out.println("\nBlumenau obteve o maior lucro com a venda de larnajs  ");
		} else if (Florianopolis.lucroLaranjas > Joinville.lucroLaranjas) {
			System.out.println("\nFloripa obteve o maior lucro com a venda de laranjas ");
		} else {
			System.out.println("\nJoinville obteve o maior lucro com a venda de laranjas");
		}

		// c) Qual das lojas teve o maior lucro nesse ano específico?
		double lucroTotalBlumenau = Blumenau.lucroLaranjas + Blumenau.lucroMacas;
		double lucroTotalFlorianopolis = Florianopolis.lucroLaranjas + Florianopolis.lucroMacas;
		double lucroTotalJoinville = Joinville.lucroLaranjas + Joinville.lucroMacas;

		if (lucroTotalBlumenau > lucroTotalFlorianopolis && lucroTotalBlumenau > lucroTotalJoinville) {

			System.out.println("Blumenau obteve o maior lucro geral com : " + lucroTotalBlumenau);
			if (lucroTotalFlorianopolis > lucroTotalJoinville) {
				System.out.println("Joiville tem o menor lucro");
				System.out.println("Floripa tem o lucro mediano");
			} else {
				System.out.println("Floripa tem o menor lucro");
				System.out.println("Joinville tem o lucro mediano");

			}
		} else if (lucroTotalFlorianopolis > lucroTotalBlumenau) {

			System.out.println("Floripa obteve o maior lucro geral com : " + lucroTotalFlorianopolis);
			if (lucroTotalBlumenau > lucroTotalJoinville) {
				System.out.println("O menor lucro foi de Joinville com " + lucroTotalJoinville);
				System.out.println("O lucro mediano foi de Blumenau com " + lucroTotalBlumenau);
			} else {
				System.out.println("O menor lucro foi de Blumenau com " + lucroTotalBlumenau);
				System.out.println("O lucro mediano foi de Joinville com " + lucroTotalJoinville);
			}
		} else {
			System.out.println("Joiniville obteve o maior lucro geral com : " + lucroTotalJoinville);
			if (lucroTotalBlumenau > lucroTotalFlorianopolis) {
				System.out.println("Florianópolis teve o menor lucro ");
				System.out.println("Blumenau teve lucro mediano");
			} else
				System.out.println("Blumenau teve o menor lucro ");
			System.out.println("Florianópolis teve lucro mediano");
		}
		// f) Juntando as 3 lojas, a franquia teve um lucro
		// maior vendendo maçãs ou laranjas?
		double lucroTotalMaca = Blumenau.lucroMacas + Florianopolis.lucroMacas + Joinville.lucroMacas;
		double lucroTotalLaranja = Blumenau.lucroLaranjas + Florianopolis.lucroLaranjas + Joinville.lucroLaranjas;

		if (lucroTotalLaranja > lucroTotalMaca) {
			System.out.println("A franquia teve um lucro maior  vendendo laranjas");
		} else {
			System.out.println("A franquia teve um lucro maior vendendo maças ");
		}
	}
}
