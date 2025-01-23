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

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);


    }
    
}