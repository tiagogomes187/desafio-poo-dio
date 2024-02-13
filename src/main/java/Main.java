import br.dev.tiagogomes.desafio.dominio.Curso;
import br.dev.tiagogomes.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curdo Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curdo Js");
		curso2.setDescricao("Descrição curso Js");
		curso2.setCargaHoraria(4);


		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição de mentoria Java");
		mentoria.setData(LocalDate.now());

		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
	}
}
