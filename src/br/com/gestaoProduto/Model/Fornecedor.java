package br.com.gestaoProduto.Model;

public class Fornecedor {
    public String nomeFornecedor;
    public String cnpj;
    public Produto[] produtosFornecedor;
    public int qntProdutosMax;

    public Fornecedor(String nomeFornecedor, String cnpj, int qntProdutosMax){
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.qntProdutosMax = qntProdutosMax;
        this.produtosFornecedor = new Produto[qntProdutosMax];
    }

    public void addProdutoFornecedor(Produto produto) {
        for(int i = 0; i < produtosFornecedor.length; i++) {
            if(produtosFornecedor[i] == null) {
                produtosFornecedor[i] = produto;
                break;
            }
        }
    }

    public void exibirInfo(){
        System.out.println("\nNome do fornecedor: " + this.nomeFornecedor);
        System.out.println("CNPJ do fornecedor" + this.cnpj);
    }
}