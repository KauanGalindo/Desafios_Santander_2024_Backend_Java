package Bootcamp.domain;

import Bootcamp.ICalcularXp;

public class Mentoria implements ICalcularXp {

    private String titulo;

    private String descricao;

    private String dataDaMentoria;

    public Mentoria (String titulo, String descricao, String dataDaMentoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataDaMentoria = dataDaMentoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataDaMentoria() {
        return dataDaMentoria;
    }

    public int calcularXp() {
        int xp = 2;
        return xp;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "Titulo: '" + titulo + '\'' +
                ", Descricao: '" + descricao + '\'' +
                ", Data da mentoria: '" + dataDaMentoria + '\'' +
                '}';
    }
}