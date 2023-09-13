package br.com.gestaoProduto.Model;

public class Fornecedor {
    public String nomeFornecedor;
    public String cnpj;
    public Produto[] produtos;

    public Fornecedor(String nomeFornecedor, String cnpj){
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;

    }
    public void exibirInfo(){
        System.out.println("Nome do fornecedor: " + this.nomeFornecedor);
        System.out.println("CNPJ do fornecedor" + this.cnpj);
    }
}