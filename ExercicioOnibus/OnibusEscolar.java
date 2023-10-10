package ExercicioOnibus;

import java.util.ArrayList;
import java.util.List;

public class OnibusEscolar {
	
	private int alunos;
	private int professores;
	
	public static List<OnibusEscolar> listaAlunos = new ArrayList();
	
	public OnibusEscolar(int alunos, int professores) {
		super();
		setAlunos (alunos);
		setProfessores (professores);
		listaAlunos.add(this);
	}
	public int getAlunos() {
		return alunos;
	}
	public void setAlunos(int alunos) {
		if (alunos > 40) {
			this.alunos =40;
		}else {
		this.alunos = alunos;
		}
	}
	public int getProfessores() {
		return professores;
	}
	public void setProfessores(int professores) {
		if (professores == 0) {
			alunos = 0;
		}else {
		this.professores = professores;
	}
	}
	// pra c
	public void removerAlunos(int remove) {
		setAlunos(alunos - remove);
	}
	@Override
	  public String toString() {
	    return " Quantidade de alunos " + this.alunos + " e a quantidade de "
	    		+ " professores " + this.professores;
}
}
