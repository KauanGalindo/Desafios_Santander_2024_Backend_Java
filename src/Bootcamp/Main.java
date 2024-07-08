package Bootcamp;

import Bootcamp.collections.ListBootcamp;
import Bootcamp.collections.ListCurso;
import Bootcamp.collections.ListMentoria;
import Bootcamp.collections.SetEstudante;
import Bootcamp.exception.ListaVaziaException;
import Bootcamp.exception.SetVaziaException;

public class Main {

    public static void main(String[] args) {

        ListBootcamp bootcamp = new ListBootcamp();
        ListCurso curso = new ListCurso();
        ListMentoria mentoria = new ListMentoria();
        SetEstudante estudante = new SetEstudante();

        bootcamp.adicionarBootcamp("Santander Backend com Java", "Do básico ao intermediario", "01/05/2024", "29/07/2024");
        bootcamp.adicionarBootcamp("Python AI Backend Developer", "Para uma carreira sólida em back-end", " 07/07/2024", "15/07/2024");
        curso.adicionarCurso("Git & Github", "Versionamento de código", "2");
        mentoria.adicionarMentoria("Aula Inaugural", "Explicando o bootcamp", "03/05/2024");
        estudante.adicionarEstudante("Maria", "12345678900", "Aula Inaugural", "Git & Github");
        estudante.adicionarEstudante("Giovanna", "12345678911", "Aula Inaugural", "Spring");

        try {
            bootcamp.exibirListaBootcamp();
            estudante.exibirCurso("Maria");
            estudante.exibirCurso("Giovanna");
        } catch (ListaVaziaException | SetVaziaException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}