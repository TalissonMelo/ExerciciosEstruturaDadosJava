package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Aluno>{

	@Override
	public int compare(Aluno aluno1, Aluno aluno2) {
	
		return aluno1.getIdade().compareTo(aluno2.getIdade());
	}

}
