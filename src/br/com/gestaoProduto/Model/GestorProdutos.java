package br.com.gestaoProduto.Model;

import java.util.UUID;

public class GestorProdutos {
    public Fornecedor[] fornecedores = new Fornecedor[100];
    public int qntFornecedores = 0;

    public void cadastrarFornecedor(Fornecedor fornecedor){
        this.fornecedores[this.qntFornecedores] = fornecedor;
        this.qntFornecedores++;
    }
    public void buscarProdPorNome(String nome) {
        for (int i = 0; i < this.qntFornecedores; i++) {
            if (fornecedores[i].produtosFornecedor[i].nome.equals(nome)) {
                fornecedores[i].produtosFornecedor[i].exibirInfo();
            }
        }
    }
    public void buscarProdPorID(UUID uuid){
        for (int i = 0; i < this.qntFornecedores; i++){
            if (fornecedores[i].produtosFornecedor[i].idDoProduto.equals(uuid)){
                fornecedores[i].produtosFornecedor[i].exibirInfo();
            }
        }
    }
    public void exibirInfoFornecedor(String nomeDoFornecedor){
        for (int i = 0; i < qntFornecedores; i++){
            if (fornecedores[i].nomeFornecedor.equals(nomeDoFornecedor)){
                fornecedores[i].exibirInfo();
            }
            else {
                System.out.println("\nFornecedor não encontrado");
            }
        }
    }
    public void exibirInfoProduto(String nome) {
        for (int i = 0; i < this.qntFornecedores; i++) {
            if (fornecedores[i].produtosFornecedor[i].nome.equals(nome)) {
                fornecedores[i].produtosFornecedor[i].exibirInfo();
            }
        }
    }
}
