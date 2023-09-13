package br.com.gestaoProduto.Model;

import java.util.UUID;

public class Estoque {

    public int qntProdutoNoEstoque;

    public Produto[] produtoNoEstoque = new Produto[100];

    public void verificarDisponibilidade(Produto produto){
        if(this.qntProdutoNoEstoque > 0){
            for (int i = 0 ; i < this.qntProdutoNoEstoque; i++){
                if (produto.quantidadeEmEstoque > 0 ){
                    System.out.printf("O produto %s esta disponivel", produto.nome);
                }
                else{
                    System.out.printf("O produto %s nao esta disponivel", produto.nome);
                }
            }
        }
    }

    public void adicionarProduto(Produto produto){
        this.produtoNoEstoque[this.qntProdutoNoEstoque] = produto;
        this.qntProdutoNoEstoque++;
    }

    public void excluirProduto(Produto produto){
        for (int i = 0 ; i < this.qntProdutoNoEstoque; i++){
            if (produtoNoEstoque[i] == produto){
                this.produtoNoEstoque[i] = null;
                this.qntProdutoNoEstoque--;
            }
        }
    }
}
