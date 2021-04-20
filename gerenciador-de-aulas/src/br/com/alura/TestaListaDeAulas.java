package br.com.alura;
import java.util.*;

public class TestaListaDeAulas {

	public static void main(String[] args) {
		Aula a1 = new Aula("Teste de testados testando", 45);
		Aula a2 = new Aula("Avançado teste testado", 65);
		Aula a3 = new Aula("Caindo na farra dos testes", 25);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
	}

}
