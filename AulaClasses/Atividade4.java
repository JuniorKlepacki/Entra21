package AulaClasses;

public class Atividade4 {

	public static void main(String[] args) {

		Circulo num1 = new Circulo();
		Circulo num2 = new Circulo();
		Circulo num3 = new Circulo();
		Circulo num4 = new Circulo();
		Circulo num5 = new Circulo();

		num1.raio = 0.89;
		num2.raio = 1.75;
		num3.raio = 12.15;
		num4.raio = 9.23;
		num5.raio = 2.12;

		System.out.println(num1.calcularArea());
		System.out.println(num2.calcularArea());
		System.out.println(num3.calcularArea());
		System.out.println(num4.calcularArea());
		System.out.println(num5.calcularArea());

	}

}
