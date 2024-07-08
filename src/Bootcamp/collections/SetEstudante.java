package Bootcamp.collections;

import Bootcamp.domain.Estudante;
import Bootcamp.exception.SetVaziaException;

import java.util.HashSet;
import java.util.Set;

public class SetEstudante {

    private Set<Estudante> e;

    public SetEstudante() {
        this.e = new HashSet<>();
    }

    public void adicionarEstudante (String nome, String cpf, String mentoria, String curso) {
        e.add(new Estudante(nome, cpf, mentoria, curso));
    }

    public void exibirCurso (String estudante) {
        if (!e.isEmpty()) {
            for (Estudante i : e) {
                if (estudante.equalsIgnoreCase(i.getNome())) {
                    System.out.println(i.getCurso());
                    break;
                }
            }
        } else {
            throw new SetVaziaException("Não foi encontrar nenhum curso.");
        }
    }
}