package Bootcamp.domain;

public class Estudante {

    private String nome;

    private String cpf;

    private String mentoria;

    private String curso;

    public Estudante(String nome, String cpf, String mentoria, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.mentoria = mentoria;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getMentoria() {
        return mentoria;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Estudante {" +
                "Nome: '" + nome + '\'' +
                ", Mentoria: '" + mentoria + '\'' +
                ", Curso: '" + curso + '\'' +
                ", Cpf: '" + cpf + '\'' +
                '}';
    }
}