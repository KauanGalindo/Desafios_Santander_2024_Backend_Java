package Bootcamp.collections;

import Bootcamp.domain.Bootcamp;
import Bootcamp.exception.ListaVaziaException;

import java.util.ArrayList;
import java.util.List;

public class ListBootcamp {

    private List<Bootcamp> b;

    public ListBootcamp() {
        this.b = new ArrayList<>();
    }

    public void adicionarBootcamp (String nome, String descricao, String dataInicio, String dataFim) {
        b.add(new Bootcamp(nome, descricao, dataInicio, dataFim));
    }

    public void exibirListaBootcamp () {
        if (!b.isEmpty()) {
            for (Bootcamp i : b) {
                System.out.println(i.toString());
            }
        } else {
            throw new ListaVaziaException("Lista vazia");
        }
    }
}