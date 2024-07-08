package Bootcamp.domain;

public class Bootcamp {

    private String nome;

    private String descricao;

    private String dataInicio;

    private String dataFim;

    public Bootcamp (String nome, String descricao, String dataInicio, String dataFim) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    @Override
    public String toString() {
        return "Bootcamp {" +
                "Nome: '" + nome + '\'' +
                ", Descricao: '" + descricao + '\'' +
                ", Data inicio: '" + dataInicio + '\'' +
                ", Data fim: '" + dataFim + '\'' +
                '}';
    }
}