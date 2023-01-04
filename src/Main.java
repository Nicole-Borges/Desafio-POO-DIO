import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNicole = new Dev();
        devNicole.setNome("Nicole");
        devNicole.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Nicole:" + devNicole.getConteudosInscritos());
        devNicole.progredir();
        devNicole.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Nicole:" + devNicole.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Nicole:" + devNicole.getConteudosConcluidos());
        System.out.println("XP:" + devNicole.calcularTotalXp());

        System.out.println("-----------");

        Dev devChris = new Dev();
        devChris.setNome("Chris");
        devChris.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Chris:" + devChris.getConteudosInscritos());
        devChris.progredir();
        devChris.progredir();
        devChris.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Chris:" + devChris.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Chris:" + devChris.getConteudosConcluidos());
        System.out.println("XP:" + devChris.calcularTotalXp());





    }
}
