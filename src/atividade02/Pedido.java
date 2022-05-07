package atividade02;

import java.util.Arrays;
import sun.security.util.Length;

public class Pedido {

    private String codigo;
    Produto[] produtos = new Produto[0];
    private Cliente cliente;

    String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;

    }

    Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = this.cliente;

    }

    Produto[] getProdutos() {
        return this.produtos;
    }

    public void setProdutos(String produto) {
        this.produtos = produtos;

    }

    public void adicionarProduto(Produto novoproduto) {
        produtos = Arrays.copyOf(this.produtos, produtos.length + 1);
        produtos[produtos.length - 1] = novoproduto;

    }

    public double valorTotal() {
        double valorTotal = 0;
        for (int i = 0; i < this.produtos.length; i++) {

            valorTotal += this.produtos[i].getValor();
        }
        return valorTotal;

    }
}
