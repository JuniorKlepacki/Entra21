package ExercicioOnibus;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    OnibusEscolar o1 = new OnibusEscolar(60, 12);
    OnibusEscolar o2 =  new OnibusEscolar(30, 0);
    OnibusEscolar o3 =  new OnibusEscolar(30, 10);
    
    
    
    for (OnibusEscolar o : OnibusEscolar.listaAlunos) {
    	System.out.println(o.toString());
    	
    }
    }
}
