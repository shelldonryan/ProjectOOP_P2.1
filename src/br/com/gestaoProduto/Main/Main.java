package br.com.gestaoProduto.Main;
import br.com.gestaoProduto.Model.*;

public class Main {
public static void main(String[] args) {
    Produto produtoMouse = new Produto(
        "Mouse Gamer X3100",
        "Mouse de super precisão para gamers.",
        199.98,
        155);
    
    Produto produtoTeclado = new Produto(
        "Teclado Mecânico ProMax",
        "Teclado mecânico de última geração com iluminação RGB.",
        299.99,
        200);

    Produto produtoHeadset = new Produto(
        "Headset SonicBlast",
        "Headset com som surround e microfone retrátil.",
        249.99,
        100);
    
    Produto produtoWebcam = new Produto(
        "Webcam X7z 4k Full Hd",
        "Webcam Full HD Com Otima Imagem.",
        399.99,
        50);

    Fornecedor fornecedor1 = new Fornecedor(
        "Suprimentos Tech Ltda.", 
        "12.345.678/0001-90", 
        3);
    
    fornecedor1.addProdutoFornecedor(produtoMouse);
    fornecedor1.addProdutoFornecedor(produtoTeclado);
    fornecedor1.addProdutoFornecedor(produtoHeadset);
    fornecedor1.addProdutoFornecedor(produtoWebcam);
    
    Produto produtoTV = new Produto(
        "Smart TV UltraHD 4K",
        "Smart TV com resolução UltraHD e 55 polegadas.",
        2299.00,
        300);
    
    Produto produtoGeladeira = new Produto(
        " Geladeira FrostFree",
        "Geladeira com tecnologia FrostFree e capacidade de 450 litros.",
        2599.00,
        400);

    Produto produtoLavarRoupa = new Produto(
        "Máquina de Lavar Roupa SuperClean",
        "Máquina de lavar roupa com diversos modos de lavagem.",
        1899.00,
        200);
    Produto produtoCamera = new Produto(
        "Câmera DSLR ProShot 2000",
        "Câmera digital de alta performance para fotógrafos profissionais.",
        3499.00,
        140);

    Fornecedor fornecedor2 = new Fornecedor(
        "EletroMega S.A.", 
        "98.765.432/0001-21", 
        4);

    fornecedor2.addProdutoFornecedor(produtoTV);
    fornecedor2.addProdutoFornecedor(produtoGeladeira);
    fornecedor2.addProdutoFornecedor(produtoLavarRoupa);
    fornecedor2.addProdutoFornecedor(produtoCamera);

    GestorProdutos gestorDeProdutos1 = new GestorProdutos();

    gestorDeProdutos1.cadastrarFornecedor(fornecedor1);
    gestorDeProdutos1.cadastrarFornecedor(fornecedor2);

    gestorDeProdutos1.exibirInfoFornecedor(fornecedor1.nomeFornecedor);
    gestorDeProdutos1.exibirInfoFornecedor(fornecedor2.nomeFornecedor);

    
    
    Estoque estoque1 = new Estoque();

    estoque1.adicionarProduto(fornecedor1.produtosFornecedor[0]);
    estoque1.adicionarProduto(fornecedor1.produtosFornecedor[1]);
    estoque1.adicionarProduto(fornecedor1.produtosFornecedor[2]);
    estoque1.adicionarProduto(fornecedor1.produtosFornecedor[3]);
    estoque1.adicionarProduto(fornecedor2.produtosFornecedor[0]);
    estoque1.adicionarProduto(fornecedor2.produtosFornecedor[1]);
    estoque1.adicionarProduto(fornecedor2.produtosFornecedor[2]);
    estoque1.adicionarProduto(fornecedor2.produtosFornecedor[3]);

    estoque1.atualizarProduto(
        fornecedor1.produtosFornecedor[1].idDoProduto, 
        230.89, 
        10);

    estoque1.gerarRelatorio();

    estoque1.verificarDisponibilidade(produtoHeadset);
    estoque1.excluirProduto(produtoHeadset);

    gestorDeProdutos1.exibirInfoProduto(produtoTeclado);
    gestorDeProdutos1.buscarProdPorNome(produtoGeladeira.nome);
    gestorDeProdutos1.buscarProdPorID(produtoTV.idDoProduto);
    }    
}
