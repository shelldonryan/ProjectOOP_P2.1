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
                    System.out.printf("\nO produto %s esta disponivel\n", produto.nome);
                    break;
                    } else{
                        System.out.printf("\nO produto %s nao esta disponivel\n", produto.nome);
                    }
                }
            }
        }
    }

    public void adicionarProduto(Produto produto){
        this.produtosNoEstoque[this.qntProdutoNoEstoque] = produto;
        this.qntProdutoNoEstoque++;
        System.out.println("\nProduto " + produto.nome + " Adicionado com Sucesso");
    }

    public void atualizarProduto(UUID idDoProduto, Double valorDoProduto, int qntEmEstoque){
        for (int i = 0 ; i < this.qntProdutoNoEstoque; i++){
            if(produtosNoEstoque[i].idDoProduto == idDoProduto){
                produtosNoEstoque[i].quantidadeEmEstoque += qntEmEstoque;
                produtosNoEstoque[i].valor = valorDoProduto;
                System.out.println("\nProduto atualizado com sucesso!");
                break;
            }else{
                System.out.println("\nProduto nao encontrado");
            }
        }
    }

    public void excluirProduto(Produto produto){
        for (int i = 0 ; i < this.qntProdutoNoEstoque; i++){
            if (produtosNoEstoque[i] == produto){
                this.produtosNoEstoque[i] = null;
                this.qntProdutoNoEstoque--;
                System.out.println("\nProduto excluido com  sucesso!");
            }
        }
    }

    public void gerarRelatorio(){
        System.out.println("\n------------------------------");
        System.out.println("\nRelatorio Produtos em estoque:");
        for (int i = 0 ; i < this.qntProdutoNoEstoque ; i++){
            produtosNoEstoque[i].exibirInfo();
        }
        System.out.println("\n------------------------------");
    }
}
