package br.com.gestaoProduto.Model.Produtos;

public class Carne extends Produto{
    public Carne(String nomeDoProduto, String descDoProduto, Double valorDoProduto, int qntEstoque) {
        super(nomeDoProduto, descDoProduto, valorDoProduto, qntEstoque);
    }

    @Override
    public void exibirInfo() {
        System.out.printf("""
                \nDetalhes do Produto:
                Nome: %s
                Descricao: %s
                Valor: R$ %.2f/kg
                Kg em Estoque: %d kg
                """, nome, desc, valor, quantidadeEmEstoque);
    }
}
