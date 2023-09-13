package br.com.gestaoProduto.Model;

public class Fornecedor {
    public String nomeFornecedor;
    public String cnpj;
    public Produto[] produtos;
    public int qntProdutosMax;

    public Fornecedor(String nomeFornecedor, String cnpj, int qntProdutosMax){
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.qntProdutosMax = qntProdutosMax;
        this.produtos = new Produto[qntProdutosMax];
    }
    public void exibirInfo(){
        System.out.println("Nome do fornecedor: " + this.nomeFornecedor);
        System.out.println("CNPJ do fornecedor" + this.cnpj);
    }
}