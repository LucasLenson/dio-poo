import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Santander 2024 - Backend com Java");
        curso1.setDescricao("O programa é ideal para pessoas de todo o Brasil que estão iniciando carreira em desenvolvimento de software, em transição de carreira ou que já atuam profissionalmente e buscam por melhores oportunidades no mercado de tecnologia. Além disso, qualquer participante poderá aprimorar suas habilidades e criar um portfólio junto com a DIO e o Santander.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Santander Dev Week");
        curso2.setDescricao("Uma imersão junto com experts da DIO utilizando uma API Rest para criação de um extrato bancário do Banco Santander na prática e do zero. Você vai construir um app Android utilizando Angular no front-end e abstrair o Domínio Bancário em Uma API REST com Java.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria DIO");
        mentoria.setDescricao("Mentoria para alunos inscritos em qualquer curso da plataforma DIO.");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp iFood Dev Week");
        bootcamp.setDescricao("O iFood e a DIO lançam um desafio: desenvolver um sistema de cadastramento para e-commerce do zero e na prática Você vai, junto com experts, instalar, criar, desenvolver e aplicar um projeto do zero, mesmo que você nunca tenha desenvolvido nada em Java.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Lucas");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Ana Julia");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana Julia:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana Julia:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ana Julia:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
