package bootcamp.poo_project;

import bootcamp.poo_project.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devFilipe = new Dev();
        devFilipe.setNome("Filipe");
        devFilipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Filipe: " + devFilipe.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Filipe: " + devFilipe.getConteudosConcluidos());

        devFilipe.progredir();

        System.out.println("Conteúdos inscritos de Filipe: " + devFilipe.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Filipe: " + devFilipe.getConteudosConcluidos());
        System.out.println("XP de Filipe: " + devFilipe.calcularTotalXp());

        devFilipe.progredir();

        System.out.println("XP de Filipe: " + devFilipe.calcularTotalXp());

        System.out.println("------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de João: " + devJoao.getConteudosConcluidos());

        devJoao.progredir();

        System.out.println("Conteúdos inscritos de João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP de João: " + devJoao.calcularTotalXp());

    }
}
