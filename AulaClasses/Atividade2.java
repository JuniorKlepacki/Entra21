package AulaClasses;

public class Atividade2 {

	public static void main(String[] args) {
		Mercada unidadeDeBlumenau = new Mercada();
		Mercada unidadeDeJoinville = new Mercada();
		Mercada unidadeDeFlorianopolis = new Mercada();

		unidadeDeBlumenau.maca = 254;
		unidadeDeBlumenau.precoMaca = 2.76;
		unidadeDeBlumenau.laranja = 102;
		unidadeDeBlumenau.precoLaranja = 3.75;

		double lucroBluLaranja=unidadeDeBlumenau.laranja*unidadeDeBlumenau.precoLaranja;
		double lucroBluMaca=unidadeDeBlumenau.maca*unidadeDeBlumenau.precoMaca;
		
		unidadeDeFlorianopolis.maca = 92;
		unidadeDeFlorianopolis.precoMaca = 5.76;
		unidadeDeFlorianopolis.laranja = 357;
		unidadeDeFlorianopolis.precoLaranja = 1.75;

		double lucroFloMaca=unidadeDeFlorianopolis.maca*unidadeDeFlorianopolis.precoMaca;
		double lucroFloLaranja=unidadeDeFlorianopolis.laranja*unidadeDeFlorianopolis.precoLaranja;
		
		unidadeDeJoinville.maca = 157;
		unidadeDeJoinville.precoMaca = 1.75;
		unidadeDeJoinville.laranja = 134;
		unidadeDeJoinville.precoLaranja = 6.78;
		
		double lucroJoMaca= unidadeDeJoinville.maca*unidadeDeJoinville.precoMaca;
		double lucroJoLaranja=unidadeDeJoinville.precoLaranja * unidadeDeJoinville.precoLaranja;

	}

}
