package br.com.desafiopoo;

import java.time.LocalDate;

import br.com.desafiopoo.dominio.Curso;
import br.com.desafiopoo.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("Descrição Curso Js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria =new Mentoria();
		mentoria.setTitulo("Mentoria do Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria);
		
	}

}
