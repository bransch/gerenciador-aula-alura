package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunoSet {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Taina Sladek");
		alunos.add("Thalia Sladek");
		alunos.add("Ricardo Monteiro");
		alunos.add("Allan Schott");
		alunos.add("Rafaela Moutinho");
		
		System.out.println(alunos);
		
		for (String x : alunos) {
			System.out.println(x);
		}
	}

}
