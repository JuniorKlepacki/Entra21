package QuestoesProva;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AdemirKlepackiJunior {

	public static void main(String[] args) {
		/*O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$ e 
somente duas casas decimais após a vírgula) e salário de cada vendedor. Descreva um algoritmo que 
gere o relatório desejado. 

		 */
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat;
		String nome;
		double vendas = 0;
		double salario=0;
		double salarioTotal=0;
		double porcentagem=0;
		System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO");	
	     char op =scanner.next().charAt(0);
	     
	     if (op == 's') {
	    	 System.out.println("Digite seu nome");
	    	 nome= scanner.next();
	    	 System.out.println("Digite o total de vendas em R$ ;");
	    	 vendas = scanner.nextDouble();
	    	 System.out.println("Digite o salário base");
	    	 salario = scanner.nextDouble();
	        porcentagem= vendas / 0.3;
	        salarioTotal=porcentagem+salario;

	     System.out.println("Nome do vendedor" + nome );
    	 System.out.println("Total de vendas: " +vendas);
    	 System.out.println("O salário total do vendedor é: " +salarioTotal);
	     }else {
	    	 System.out.println("Obrigado pela atenção");
	}
	
	}}
	
	


