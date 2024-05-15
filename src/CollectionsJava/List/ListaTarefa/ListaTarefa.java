package CollectionsJava.CollectionList.ListaTarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //Atributo
    private List<Tarefa> listaTarefa;

    // Construtor
    public ListaTarefa() {
        this.listaTarefa = new ArrayList<>();
    }

    // Método adicionar Tarefa
    public void addTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    // Método remover Tarefas
    public void removeTarefa(String descricao) {
        List<Tarefa> removeTarefa = new ArrayList<>();
        if (!listaTarefa.isEmpty()) {
            for (Tarefa t : listaTarefa) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    removeTarefa.add(t);
                }
            }
            listaTarefa.removeAll(removeTarefa);
        } else {
            System.out.println("Lista vazia.");
        }
    }

    // Método Número de Tarefas
    public int obterNumeroTotalDeTarefas(){
        return listaTarefa.size();
    }

    // Método que retorna a descrição das tarefas
    public void descricaoDasTarefas(){
        if (!listaTarefa.isEmpty()) {
            for (Tarefa t : listaTarefa) {
                System.out.println(t.getDescricao());
            }
        } else {
            System.out.println("Lista vazia.");
        }
    }
}
