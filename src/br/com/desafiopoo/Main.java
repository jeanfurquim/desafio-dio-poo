package br.com.desafiopoo;

import java.time.LocalDate;

import br.com.desafiopoo.dominio.Bootcamp;
import br.com.desafiopoo.dominio.Curso;
import br.com.desafiopoo.dominio.Dev;
import br.com.desafiopoo.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("Descri��o Curso Js");
		curso2.setCargaHoraria(4);
		
		
		
		Mentoria mentoria =new Mentoria();
		mentoria.setTitulo("Mentoria do Java");
		mentoria.setDescricao("Descri��o Mentoria Java");
		mentoria.setData(LocalDate.now());
		
	/*	System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("BootCamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devJean = new Dev();
		devJean.setNome("Jean");
		devJean.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Jean" + devJean.getConteudosInscritos());
		devJean.progredir();
		devJean.progredir();
		
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Jean" + devJean.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos Jean" + devJean.getConteudosConcluidos());
		System.out.println("XP:" + devJean.calcularTotalXp());
		
		System.out.println("--------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Jo�o" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Jo�o" + devJoao.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos Jo�o" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());
	}

}
