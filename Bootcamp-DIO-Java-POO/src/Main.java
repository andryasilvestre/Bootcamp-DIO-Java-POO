import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Java DIO");
        course1.setDescription("Orange Tech Bootcamp - DIO");
        course1.setWorkLoad(72);

        Tutoring tutoring1 = new Tutoring();
        tutoring1.setTitle("Mentoria de JAVA");
        tutoring1.setDescription("Mentoria de JAVA - DIO - Teste");
        tutoring1.setDate(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setName("Orange Tech");
        bootcamp1.setDescription("Descrição Orange Tech do Inter");
        bootcamp1.getContents().add(course1);
        bootcamp1.getContents().add(tutoring1);

        Dev devAndrya = new Dev();
        devAndrya.setName("Ândrya Silvestre");
        devAndrya.joinBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos Ândrya " +devAndrya.getSubscribedContent());
        System.out.println("Conteúdos concluídos Ândrya " +devAndrya.getCompletedContent());


        Dev devMaggie = new Dev();
        devMaggie.setName("Maggie May");
        devMaggie.joinBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos Maggie " +devMaggie.getSubscribedContent());
        System.out.println("Conteúdos concluídos Maggie " +devMaggie.getCompletedContent());
        devMaggie.progression();
        System.out.println("XP: "+devMaggie.calculateTotalXp());
        System.out.println("-----------");
        System.out.println("Conteúdos inscritos Maggie " +devMaggie.getSubscribedContent());
        System.out.println("Conteúdos concluídos Maggie " +devMaggie.getCompletedContent());
        devMaggie.progression();
        System.out.println("Conteúdos inscritos Maggie " +devMaggie.getSubscribedContent());







    }
}