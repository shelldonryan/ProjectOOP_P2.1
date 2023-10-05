package br.com.gestaoProduto.Model.Produtos;

public class Camisa extends Produto{
    public Camisa(String nomeDoProduto, String descDoProduto, Double valorDoProduto, int qntEstoque) {
        super(nomeDoProduto, descDoProduto, valorDoProduto, qntEstoque);
    }

    @Override
    public void exibirInfo() {
        System.out.printf("""
                \nDetalhes do Produto:
                Nome: %s
                Descricao: %s
                Valor: R$ %.2f
                Quantidade em estoque: %d
                """, nome, desc, valor, quantidadeEmEstoque);
    }
}
