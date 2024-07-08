package Bootcamp.collections;

import Bootcamp.domain.Mentoria;

import java.util.ArrayList;
import java.util.List;

public class ListMentoria {

    private List<Mentoria> m;

    public ListMentoria() {
        this.m = new ArrayList<>();
    }

    public void adicionarMentoria (String titulo, String descricao, String dataDaMentoria) {
        m.add(new Mentoria(titulo, descricao, dataDaMentoria));
    }
}