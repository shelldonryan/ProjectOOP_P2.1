package br.com.gestaoProduto.Model.Fornecedor;

public class Alimento extends Fornecedor{
    public Alimento(String nomeFornecedor, String cnpj, int qntProdutosMax) {
        super(nomeFornecedor, cnpj, qntProdutosMax);
    }

    @Override
    public void produtosDoFornecedor() {
        System.out.println("Lista de Produtos");
        for(int i=0; i < produtosFornecedor.length; i++) {
            if(produtosFornecedor[i] != null)
            System.out.printf("%s: R$ %.2f", produtosFornecedor[i].nome, produtosFornecedor[i].valor);
        }
    }
}
