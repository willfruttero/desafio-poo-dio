import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descri��o curso Javascript");
		curso2.setCargaHoraria(4);

		Conteudo conteudo = new Curso();

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria Java");
		mentoria.setDescricao("descri��o mentoria Java");
		mentoria.setData(LocalDate.now());

		// System.out.println(curso1);
		// System.out.println(curso2);
		// System.out.println(mentoria);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev dev = new Dev();
		dev.setNome("Will");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos " + dev.getNome() + ": " + dev.getConteudosInscritos());
		dev.progredir();
		dev.progredir();
		dev.progredir();
		System.out.println("Conte�dos Inscritos " + dev.getNome() + ": " + dev.getConteudosInscritos());
		System.out.println("Conte�dos conclu�dos " + dev.getNome() + ": " + dev.getConteudoConcluidos());
		System.out.println("XP:" + dev.calcularTotalXp());

		System.out.println("==========================================================");
		
		Dev dev2 = new Dev();
		dev2.setNome("Fruttero");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("Conte�dos Inscritos " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos " + dev2.getNome() + ": " + dev2.getConteudoConcluidos());
		System.out.println("XP:" + dev2.calcularTotalXp());
	}
}
