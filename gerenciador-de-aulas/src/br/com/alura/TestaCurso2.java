package br.com.alura;

public class TestaCurso2 {
	public static void main(String[] args) throws Exception {
		Curso  javaColecoes = new Curso ("Dominando coleções JAva","Anderson Schott");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando um aula",20));
		javaColecoes.adiciona(new Aula("Modelando construções", 33));
		//System.out.println(javaColecoes.getAulas());
		
		Aluno a1 = new Aluno("Allan Schott", 2332);
		Aluno a2 = new Aluno("Taina Sladek", 4352);
		Aluno a3 = new Aluno("Thalia Sladek", 6564);
		Aluno a4 = new Aluno("João Corvino", 9283);
		Aluno a5 = new Aluno("Marco Aurelo", 3871);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		javaColecoes.matricula(a5);
		
		Aluno busca = new Aluno("Allan Schott", 2132);
		
		System.out.println(javaColecoes.estaMatriculado(busca));
		
		
	}
}
