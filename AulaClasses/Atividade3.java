package AulaClasses;

public class Atividade3 {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();

		produto1.nome = "      Caderno 96 folhas   ";
		produto1.descricao = " Caderno com linha";
		produto1.precoUnit = 7.79;
		produto1.desconto = 0.85;

		double precototal1 = produto1.precoUnit * produto1.desconto;
		System.out.println(produto1.nome);
		System.out.println(produto1.descricao);
		System.out.println(produto1.precoUnit);
		System.out.println("Com o desconto o produto passa a valer : " + precototal1);
        
        produto2.nome ="      Canete ESF      ";
        produto2.descricao = "Caneta esferográfica 5mm";
        produto2.precoUnit= 1.20;
        produto2.desconto=0.98;
        
        double precoTotal2= produto2.precoUnit*produto2.desconto;
        System.out.println(produto2.nome);
        System.out.println(produto2.descricao);
        System.out.println(produto2.precoUnit);
        
        System.out.println("Com o desconto o produto passa a valer : " + precoTotal2);
	}

}
