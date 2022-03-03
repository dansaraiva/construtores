package app;

import entidades.Aluno;

public class Aplicativo {

	public static void main(String[] args) {

		Aluno a = new Aluno();
		
		a.setFarda(true);
		a.setIdade(16);
		a.setMat("123");
		
		System.out.println("Está fardado?" + a.isFarda());
		System.out.println("Mat: " + a.getMat());
		System.out.println("Idade: " + a.getIdade());
		
	}

}
