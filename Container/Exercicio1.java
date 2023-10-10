package Container;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {
		//Coloque 5 elementos em uma Array List e ordene-os
		List<String> listaDeNomes  = new ArrayList<>();
	    listaDeNomes.add("Seu Ademir");
	    listaDeNomes.add("Jorge");
	    listaDeNomes.add("jonathan");
	    listaDeNomes.add("Sérgio");
	    listaDeNomes.add("Daniel");
	    
	    for (int i = 0 ; i < listaDeNomes.size() ; i ++) {
	    	System.out.println(listaDeNomes.get(i) + " esta na posição : " + i);
	    }
	}

}
