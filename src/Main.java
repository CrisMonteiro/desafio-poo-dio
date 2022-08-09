import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public  class Main {
    public static void main(String[] args)  {
        Curso curso1 = new Curso() {
            @Override
            public double cacularxp() {
                return 0;
            }

            @Override
            public double calcularxp() {
                return 0;
            }
        };
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(Integer.parseInt("8"));


       /* Curso curso2 = new Curso() {
            @Override
            public double cacularxp() {
                return 0;
            }*/

            @Override
            public double calcularxp() {
                return 0;
            }
        };
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Js");
        curso1.setCargaHoraria(Integer.parseInt("4"));


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());



       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Develope");
        bootcamp.setInscricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCristina =new Dev();
        devCristina.setNome("Cristina");
        devCristina.inscreverBootcamp(bootcamp);
        devCristina.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devCristina.getconteudosInscritos());
        System.out.println("Conteudos Concluidos Cristina" + devCristina.getconteudosConcluidos());
        System.out.println("xp" + devCristina.CalcularTotalXp())

            System.out.println("--------");
        Dev devJoao =new Dev();
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.setNome("Joao");
        devJoao.progredir();
        System.out.println("-");
         System.out.println("Conteudos Inscritos" + devJoao.getconteudosInscritos());
          System.out.println("Conteudos Concluidos Joao" + devCristina.getconteudosConcluidos());
          System.out.println("xp" + devJoao.CalcularTotalXp())


    


    }

