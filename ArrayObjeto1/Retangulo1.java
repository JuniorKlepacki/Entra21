package ArrayObjeto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Retangulo1 {
	private double base;
	private double lado;
    // metodos privados
	public static List<Retangulo1> listaRetangulos= new ArrayList();

	//metodo construtor
	public Retangulo1(double base, double lado) {
		super();
		setBase (base);
		setLado (lado);
		listaRetangulos.add(this);
 	}
    // get and set
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if (base <= 0) {
			System.out.println("Base invalida");
	}else {
		this.base = base;
	}
	}
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		 if ( base <= 0 ) {
			 System.out.println("Lado inváido");
	}else {
		this.lado = lado;
	}			
		 }
		 public double calcularArea() {
			 return this.getLado() * this.getBase();
		
	}
		 public double calcularPerimetro() {
			 return (this.getLado() * 2) + (this.getBase() *2);
		 }
		 @Override
		 public String toString() {
			 return " o retangulo de altura " + this.getLado() + " e"
			 		+ " de largura  :" + this.getBase();
			 		 
					 
 		 }
	 
		 }
		 

