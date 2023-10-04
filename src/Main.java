import br.com.desafio.poo.dominio.Bootcamp;
import br.com.desafio.poo.dominio.Curso;
import br.com.desafio.poo.dominio.Dev;
import br.com.desafio.poo.dominio.Mentoria;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Orientação objeto");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Banco de dados");
        curso2.setDescricao("SQL e NoSQL");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Java e POO");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootecamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos" + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXp());

        System.out.println("-------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootecamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());


    }
}