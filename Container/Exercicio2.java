package Container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		// Crie uma Array List e imprima os últimos elementos por primeiro
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(768);
		listaNumeros.add(157);

		System.out.println(listaNumeros);
		Collections.reverse(listaNumeros);
		System.out.println(listaNumeros);
		}

	}


