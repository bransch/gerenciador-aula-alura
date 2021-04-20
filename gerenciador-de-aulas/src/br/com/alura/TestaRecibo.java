package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestaRecibo {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("anderson", 27);
		Funcionario f2 = new Funcionario("Taina", 22);
		Funcionario f3 = new Funcionario("Taiara", 25);

		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());

		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);

		Iterator<Funcionario> it = funcionarios.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}

	}

}