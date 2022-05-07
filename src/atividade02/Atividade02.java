package atividade02;
//private tu consegue acessar só dentro da classe.
// public fica acessivel em todas as classes.
// packageprivate fica acessivel no pacote para tds as classes e private para outro pacote.

public class Atividade02 {

    public static void main(String[] args) {
        final Cliente clienteJão = new Cliente();
        clienteJão.getNome();
        clienteJão.getCpf();
        clienteJão.getTelefone();

        final Produto produtoSal = new Produto();
        produtoSal.getNome();
        produtoSal.getQuantidade();
        produtoSal.getValor();

        final Produto produtofeijao = new Produto();
        produtofeijao.getNome();
        produtofeijao.getQuantidade();
        produtofeijao.getValor();
        produtofeijao.alterarvalor(7.50);

        final Pedido pedidoFinal = new Pedido();
        pedidoFinal.getCodigo();
        pedidoFinal.getCliente();
        pedidoFinal.produtos = new Produto[]{produtoSal};

        Double valorTotal = pedidoFinal.valorTotal();
        System.out.println("Nome do Cliente:" + clienteJão.getNome());
        System.out.println("Nome do Produto:" + produtoSal.getNome());

    }
}
