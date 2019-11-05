package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Aluno;

public class Programa {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();

		alunos.add(new Aluno("Maria", 24));
		alunos.add(new Aluno("Ana", 12));
		alunos.add(new Aluno("Bob", 23));
		alunos.add(new Aluno("Alex", 38));

		Collections.sort(alunos);
		
		for (Aluno x : alunos) {
			System.out.println(x);
		}

	}

}
