package br.com.gestaoProduto.Main;
import br.com.gestaoProduto.Model.Estoque.Shopping;
import br.com.gestaoProduto.Model.Estoque.Supermercado;
import br.com.gestaoProduto.Model.Fornecedor.Alimento;
import br.com.gestaoProduto.Model.Fornecedor.Roupa;
import br.com.gestaoProduto.Model.GestorProdutos.Gerente;
import br.com.gestaoProduto.Model.GestorProdutos.Supervisor;
import br.com.gestaoProduto.Model.Produtos.Camisa;
import br.com.gestaoProduto.Model.Produtos.Carne;

public class Main {
public static void main(String[] args) {
    Carne tipo1Carne = new Carne(
        "Carne Premium de Angus",
        "Uma carne de alta qualidade, proveniente de gado Angus cuidadosamente selecionado.",
        59.90,
        500);
    
    Carne tipo2Carne = new Carne(
        "Carne de Cordeiro Australiano",
        "Originária das vastas pastagens da Austrália, esta carne de cordeiro é conhecida por sua textura tenra e sabor distinto.",
        299.99,
        200);

    Carne tipo3Carne = new Carne(
        "Costela de Porco Defumada",
        "Esta costela suculenta passa por um processo de defumação artesanal, resultando em um sabor defumado inigualável.",
        34.90,
        800);
    
    Carne tipo4Carne = new Carne(
        "Costela de Porco Defumada",
        "Proveniente das águas frias e puras do Alasca, este filé de salmão selvagem é uma escolha saudável e deliciosa.",
        89.90,
        400);

    Alimento fornecedor1 = new Alimento(
        "Suprimentos Tech Ltda.", 
        "12.345.678/0001-90", 
        4);
    
    fornecedor1.addProdutoFornecedor(tipo1Carne);
    fornecedor1.addProdutoFornecedor(tipo2Carne);
    fornecedor1.addProdutoFornecedor(tipo3Carne);
    fornecedor1.addProdutoFornecedor(tipo4Carne);
    fornecedor1.produtosDoFornecedor();
    
    Camisa option1Roupa = new Camisa(
        "Adidas Slim",
        "Smart TV com resolução UltraHD e 55 polegadas.",
        199.00,
        300);
    
    Camisa option2Roupa = new Camisa(
        "Nike Dry-fit",
        "Geladeira com tecnologia FrostFree e capacidade de 450 litros.",
        259.00,
        400);

    Camisa option3Roupa = new Camisa(
        "Lacoste Polo",
        "Máquina de lavar roupa com diversos modos de lavagem.",
        499.00,
        200);
    Camisa option4Roupa = new Camisa(
        "Casaco Gucci",
        "Câmera digital de alta performance para fotógrafos profissionais.",
        1699.00,
        140);

    Roupa fornecedor2 = new Roupa(
        "Clothes S.A.", 
        "98.765.432/0001-21", 
        4);

    fornecedor2.addProdutoFornecedor(option1Roupa);
    fornecedor2.addProdutoFornecedor(option2Roupa);
    fornecedor2.addProdutoFornecedor(option3Roupa);
    fornecedor2.addProdutoFornecedor(option4Roupa);
    fornecedor2.produtosDoFornecedor();

    Supervisor gestorDeProdutos1 = new Supervisor(3);
    Gerente gestorDeProdutos2 = new Gerente(3);

    gestorDeProdutos1.cadastrarFornecedor(fornecedor1);
    gestorDeProdutos1.exibirInfoFornecedor(fornecedor1.nomeFornecedor);
    
    gestorDeProdutos2.cadastrarFornecedor(fornecedor2);
    gestorDeProdutos2.exibirInfoFornecedor(fornecedor2.nomeFornecedor);

    
    
    Supermercado estoque1 = new Supermercado(10000);
    Shopping estoque2 = new Shopping(1000);

    estoque1.adicionarProduto(fornecedor1.produtosFornecedor[0]);
    estoque1.adicionarProduto(fornecedor1.produtosFornecedor[1]);
    estoque1.adicionarProduto(fornecedor1.produtosFornecedor[2]);
    estoque1.adicionarProduto(fornecedor1.produtosFornecedor[3]);
    estoque2.adicionarProduto(fornecedor2.produtosFornecedor[0]);
    estoque2.adicionarProduto(fornecedor2.produtosFornecedor[1]);
    estoque2.adicionarProduto(fornecedor2.produtosFornecedor[2]);
    estoque2.adicionarProduto(fornecedor2.produtosFornecedor[3]);

    estoque1.atualizarProduto(
        fornecedor1.produtosFornecedor[2].idDoProduto, 
        45.89, 
        400);
    
    estoque2.atualizarProduto(
        fornecedor1.produtosFornecedor[3].idDoProduto, 
        1500.46, 
        120);

    estoque1.gerarRelatorio();
    estoque2.gerarRelatorio();

    estoque1.verificarDisponibilidade(tipo3Carne);
    estoque1.excluirProduto(tipo4Carne);
    
    estoque2.verificarDisponibilidade(option4Roupa);
    estoque2.excluirProduto(option4Roupa);

    gestorDeProdutos1.exibirInfoProduto(tipo1Carne);
    gestorDeProdutos1.buscarProdPorNome(tipo2Carne.nome);
    gestorDeProdutos1.buscarProdPorID(tipo3Carne.idDoProduto);
    
    gestorDeProdutos2.exibirInfoProduto(option1Roupa);
    gestorDeProdutos2.buscarProdPorNome(option2Roupa.nome);
    gestorDeProdutos2.buscarProdPorID(option3Roupa.idDoProduto);
    }    
}
