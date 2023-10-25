package br.com.gestaoProduto.Model.Fornecedor;

import java.util.UUID;

import br.com.gestaoProduto.Model.Produtos.Produto;
import br.com.gestaoProduto.exception.ProdutosException;
import br.com.gestaoProduto.exception.QuantidadeProdutosFornecedorException;
public abstract class Fornecedor {
    public String nomeFornecedor;
    public String cnpj;
    public Produto[] produtosFornecedor;
    public int qntProdutosMax;
    public UUID idDoFornecedor;

    public Fornecedor(String nomeFornecedor, String cnpj, int qntProdutosMax){
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.qntProdutosMax = qntProdutosMax;
        this.produtosFornecedor = new Produto[qntProdutosMax];
        this.idDoFornecedor = UUID.randomUUID();
    }

    public void addProdutoFornecedor(Produto produto) {
        for(int i = 0; i < produtosFornecedor.length; i++) {
            if (produtosFornecedor[i] == null) {
                produtosFornecedor[i] = produto;
                break;   
            }
        }
        throw new QuantidadeProdutosFornecedorException("Quantidade maxima de produtos atingida");
    }

    public void exibirInfo(){
        System.out.println("\nNome do fornecedor: " + this.nomeFornecedor);
        System.out.println("CNPJ do fornecedor" + this.cnpj);
    }

    public void produtosDoFornecedor() {
        System.out.println("Coloque um titulo");
        for(int i=0; i < produtosFornecedor.length; i++) {
            if(produtosFornecedor[i] != null) {
                System.out.println("Coloque o nome: coloque o valor");
            } else {
                throw new ProdutosException("Produto não encontrado");
            }
        }
    }
}