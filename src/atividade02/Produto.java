package atividade02;

public class Produto {

    //atributos
    private String nome;
    private double valor;
    private int quantidade;

    double getValor() {
        return this.valor;

    }

    public void setValor(double valor) {
        this.valor = valor;

    }

    String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.valor = valor;

    }

    int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;

    }

    //metodos
    public void alterarvalor(double novoValor) {
        this.valor = novoValor;
    }

}
