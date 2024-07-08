package Bootcamp.collections;

import Bootcamp.domain.Curso;

import java.util.ArrayList;
import java.util.List;

public class ListCurso {

    private List<Curso> c;

    public ListCurso () {
        this.c = new ArrayList<>();
    }

    public void adicionarCurso (String titulo, String descricao, String cargaHoraria) {
        c.add(new Curso (titulo, descricao, cargaHoraria));
    }
}