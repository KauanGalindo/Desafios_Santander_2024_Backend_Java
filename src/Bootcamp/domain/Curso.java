package Bootcamp.domain;

import Bootcamp.ICalcularXp;

public class Curso implements ICalcularXp {

    private String titulo;

    private String descricao;

    private String cargaHoraria;

    public Curso (String titulo, String descricao, String cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public int calcularXp() {
        int xp = 1;
        return xp;
    }

    @Override
    public String toString() {
        return "Curso {" +
                "Titulo: '" + titulo + '\'' +
                ", Descricao: '" + descricao + '\'' +
                ", Carga horaria: '" + cargaHoraria + '\'' +
                '}';
    }
}