package br.com.gestaoProduto.Model;

import java.util.UUID;

public class Produto {
    public UUID idDoProduto;
    public String nome;
    public String desc;
    public Double valor;
    public int quantidadeEmEstoque;

    public Produto(String nomeDoProduto, String descDoProduto, Double valorDoProduto, int qntEstoque) {
        this.nome = nomeDoProduto;
        this.desc = descDoProduto;
        this.valor = valorDoProduto;
        this.quantidadeEmEstoque = qntEstoque;
        this.idDoProduto = UUID.randomUUID();
    }

    public void exibirInfo() {
        System.out.printf("""
                \nDetalhes do Produto:
                Nome: %s
                Descricao: %s
                Valor: R$ %.2f
                Quantidade no estoque: %d
                """, nome, desc, valor, quantidadeEmEstoque);
    }
}
