package BancoDigital;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> conta;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return conta;
    }

}
