import br.com.desafio.poo.dominio.Curso;
import br.com.desafio.poo.dominio.Mentoria;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Orientação objeto");
        curso1.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Java e POO");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);
    }
}