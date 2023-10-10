package ArrayObjeto1;

import java.util.Arrays;
import java.util.List;

public class Retangulo {

	public static void main(String[] args) {
		//Criar objetos
		Retangulo1 r1 = new Retangulo1(10, 5);
		Retangulo1 r2 = new Retangulo1(2, 5);
		Retangulo1 r3 = new Retangulo1(23 , 2);
		Retangulo1 r4 = new Retangulo1(1, 9);
		Retangulo1 r5 = new Retangulo1(5, 4);
		Retangulo1 r6 = new Retangulo1(9, 5);
		Retangulo1 r7 = new Retangulo1(11, 9);
		Retangulo1 r8 = new Retangulo1(3, 5);
		Retangulo1 r9 = new Retangulo1(77, 9);
		Retangulo1 r10 = new Retangulo1(22, 14);
		
		double maiorPerimetro = Integer.MIN_VALUE;
		double maiorArea = Integer.MIN_VALUE;
		Retangulo1 retMaiorPerimetro = null;
		Retangulo1 retMaiorArea = null;
		for (Retangulo1 ret : Retangulo1.listaRetangulos) {
			
			if ( ret.calcularArea() > maiorArea) {
				maiorArea = ret.calcularArea();
				retMaiorArea = ret;
				// passa o objeto inteiro
	
				}
			if (ret.calcularPerimetro() > maiorPerimetro) {
				maiorPerimetro= ret.calcularPerimetro();
				retMaiorPerimetro = ret;
			}
		}
		System.out.println("Maior área: " +retMaiorArea.toString());
		System.out.println("Maior perímetro: " + retMaiorPerimetro.toString());
		}
		}
	

