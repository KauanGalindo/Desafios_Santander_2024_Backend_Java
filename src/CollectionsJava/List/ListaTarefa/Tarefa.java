package CollectionsJava.List.ListaTarefa;

public class Tarefa {

    // Atributo
    private final String descricao;

    // Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Getter
    public String getDescricao() {
        return descricao;
    }

    // toString
    @Override
    public String toString() {
        return  descricao;
    }
}
