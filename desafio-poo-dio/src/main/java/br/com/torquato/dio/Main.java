package br.com.torquato.dio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso JAVA");
        curso.setDescricao("Descrição curso JAVA");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA2");
        curso1.setDescricao("Descrição curso JAVA2");
        curso1.setCargaHoraria(4);

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso);
        // System.out.println(curso1);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devRuan = new Dev();
        devRuan.setNome("Ruan");
        devRuan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Ruan: " + devRuan.getConteudosInscritos());
        devRuan.progredir();
        System.out.println("Conteudos Concluidos Ruan: " + devRuan.getConteudosConcluidos());
        System.out.println("XP: " + devRuan.calcularXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());
    }

}