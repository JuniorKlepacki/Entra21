package aula8;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*
		 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
		 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
		 * pedir as informações, caso seja certo, de os parabéns e encerre o programa.
		 */
		String senha;
		System.out.print("Digite o nome de usuário: ");
		String nomeUsuario = scanner.nextLine();
		System.out.print("Digite a senha: ");
		senha = scanner.nextLine();
		
		if (senha.equals(nomeUsuario)) {
			System.out.println("A senha não pode ser igual ao nome de usuário.");
		} else {
			System.out.println("Parabéns! A senha está correta.");
		}
		while (senha.equals(nomeUsuario)) {
			System.out.print("Digite o nome de usuário: ");
	    nomeUsuario = scanner.nextLine();
		System.out.print("Digite a senha: ");
		senha = scanner.nextLine();
		if (senha.equals(nomeUsuario)) {
			System.out.println("A senha não pode ser igual ao nome de usuário.");
		} else {
			System.out.println("Parabéns! A senha está correta.");
		}
			;

		System.out.println("Programa encerrado.");
	}
}
}