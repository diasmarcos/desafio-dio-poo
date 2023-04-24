import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria =  new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //mentoria.setData(LocalDate.parse(LocalDate.now().format(formatter)));


        //System.out.println(mentoria);
        //System.out.println(curso1);
        //System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos Dias");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos "+devMarcos.getNome()+" "+devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos "+devMarcos.getNome()+" "+devMarcos.getConteudosInscritos());
        System.out.println("Conteudo Concluidos "+devMarcos.getNome()+" "+devMarcos.getConteudosConcuidos());
        System.out.println("XP: "+devMarcos.calcularTotalXp());

        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos "+devJoao.getNome()+" "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos "+devJoao.getNome()+" "+devJoao.getConteudosInscritos());
        System.out.println("Conteudo Concluidos "+devJoao.getNome()+" "+devJoao.getConteudosConcuidos());
        System.out.println("XP: "+devJoao.calcularTotalXp());




    }
}
