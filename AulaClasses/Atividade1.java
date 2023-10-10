package AulaClasses;

public class Atividade1 {
	

	public static void main(String[] args) {
		Pessoa Ademir = new Pessoa();
		Pessoa Miguel = new Pessoa();
		
		Ademir.nome = "Ademir";
		Ademir.sexo = 'H';
		Ademir.data = "28/11/2006";
		Ademir.dadocivil = "naPista";
		
		System.out.println("O " + Ademir.nome + " é " + Ademir.sexo + " nasceu no dia "  + Ademir.data + " e esta " + Ademir.dadocivil );
		
	    Miguel.nome = "Miguel";
		Miguel.sexo = 'H' ;
		Miguel.data = "08/08/2005";
		Miguel.dadocivil = "tonto";
		System.out.println("\nO " + Miguel.nome + " é " + Miguel.sexo + " nasceu no dia "  + Miguel.data + " e esta " + Miguel.dadocivil );
		
	}

}
