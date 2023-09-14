package br.com.gestaoProduto.Model;

import java.util.UUID;

public class Estoque {

    public int qntProdutoNoEstoque;

    public Produto[] produtosNoEstoque = new Produto[100];

    public void verificarDisponibilidade(Produto produto){
        if(this.qntProdutoNoEstoque > 0){
            for (int i = 0 ; i < this.qntProdutoNoEstoque; i++){
                if(produtosNoEstoque[i] == produto){
                    if (produto.quantidadeEmEstoque > 0 ){
                    System.out.printf("O produto %s esta disponivel", produto.nome);
                    }
                    else{
                        System.out.printf("O produto %s nao esta disponivel", produto.nome);
                    }
                }
                else {
                    System.out.println("Produto não encontrado no estoque.");
                }
            }
        }
    }

    public void adicionarProduto(Produto produto){
        this.produtosNoEstoque[this.qntProdutoNoEstoque] = produto;
        this.qntProdutoNoEstoque++;
    }

    public void atualizarProduto(UUID idDoProduto, Double valorDoProduto, int qntEmEstoque){
        for (int i = 0 ; i < this.qntProdutoNoEstoque; i++){
            if(produtosNoEstoque[i].idDoProduto == idDoProduto){
                produtosNoEstoque[i].quantidadeEmEstoque += qntEmEstoque;
                produtosNoEstoque[i].valor = valorDoProduto;
                System.out.println("Produto atualizado com sucesso!");
            }else{
                System.out.println("Produto nao encontrado");
            }
        }
    }

    public void excluirProduto(Produto produto){
        for (int i = 0 ; i < this.qntProdutoNoEstoque; i++){
            if (produtosNoEstoque[i] == produto){
                this.produtosNoEstoque[i] = null;
                this.qntProdutoNoEstoque--;
            }
        }
    }
}
