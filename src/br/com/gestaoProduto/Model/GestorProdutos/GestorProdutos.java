package br.com.gestaoProduto.Model.GestorProdutos;

import java.util.UUID;

import br.com.gestaoProduto.Model.Fornecedor.Fornecedor;
import br.com.gestaoProduto.Model.Produtos.Produto;

public abstract class GestorProdutos {
    public Fornecedor[] fornecedores;
    public int qntFornecedores;

    public GestorProdutos(int qntFornecedores) {
        this.fornecedores = new Fornecedor[qntFornecedores];
    }

    public void cadastrarFornecedor(Fornecedor fornecedor){
        this.fornecedores[this.qntFornecedores] = fornecedor;
        this.qntFornecedores++;
        System.out.println("\nFornecedor Cadastrado");
    }
    public void buscarProdPorNome(String nome) {
        for (int i = 0; i < this.qntFornecedores; i++) {
            for (int j = 0; j < this.fornecedores[i].produtosFornecedor.length; j++) {
                if (fornecedores[i].produtosFornecedor[j].nome.equals(nome)) {
                System.out.println("\n___________________");
                System.out.println("Busca Por Nome");
                fornecedores[i].produtosFornecedor[j].exibirInfo();
                System.out.println("-------------");
            }
            }
        }
    }
    public void buscarProdPorID(UUID uuid){
        for (int i = 0; i < this.qntFornecedores; i++){
            for (int j = 0; j < this.fornecedores[i].produtosFornecedor.length; j++) {
                if (fornecedores[i].produtosFornecedor[j].idDoProduto.equals(uuid)){
                System.out.println("\n___________________");
                System.out.println("Busca Por ID");
                fornecedores[i].produtosFornecedor[j].exibirInfo();
                System.out.println("-------------");
                }
            }
        }
    }
    public void exibirInfoFornecedor(String nomeDoFornecedor){
        for (int i = 0; i < qntFornecedores; i++){
            if (fornecedores[i].nomeFornecedor.equals(nomeDoFornecedor)){
                System.out.println("\n-------------");
                System.out.println("Informações do Fornecedor");
                fornecedores[i].exibirInfo();
                System.out.println("-------------");
            }
        }
    }
    public void exibirInfoProduto(Produto produto) {
        for (int i = 0; i < this.qntFornecedores; i++) {
            for (int j = 0; j < this.fornecedores[i].produtosFornecedor.length; j++) {
                if (fornecedores[i].produtosFornecedor[j] == produto) {
                System.out.println("\n-------------");
                fornecedores[i].produtosFornecedor[j].exibirInfo();
                System.out.println("-------------");
            }
            }
        }
    }
}
