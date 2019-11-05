package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Aluno>{

	@Override
	public int compare(Aluno a1, Aluno a2) {
	
		return a1.getNome().compareTo(a2.getNome());
	}

}
