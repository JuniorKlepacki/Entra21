package AulaClasses;

public class funcao {
	//Fórmla = public static tipo nome () {}
	public static String imprimirNome() {
		//dentro do nosso escopo, a gente passa a  ter o retorno
		//sempre criar uma variavel
		String nome ="Junior "; 
		return nome;

	}
	
	public static double calculo(double numUm, double numDois) {
		double  soma = numUm + numDois;
		return soma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(imprimirNome());
	}

}
