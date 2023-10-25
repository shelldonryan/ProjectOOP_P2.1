package br.com.gestaoProduto.Main;
import java.util.Scanner;

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
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do produto:");
    String nomeDoProduto = scanner.nextLine();
    System.out.println("\nDescrição do produto: ");
    String descDoProduto = scanner.nextLine();
    System.out.println("\nDigite o valor do produto:");
    double valorDoProduto = scanner.nextDouble();
    System.out.println("\nDigite a quantidade em estoque: ");
    int qntEstoque = Integer.parseInt(scanner.nextLine());

    Carne tipo1Carne = new Carne(
        nomeDoProduto,
        descDoProduto,
        valorDoProduto,
        qntEstoque);
    
    System.out.println("\nDigite o nome do segundo fornecedor: ");
    String nomeFornecedor = scanner.nextLine();
    System.out.println("\ndigite o numero do cnpj: ");
    String numeroCnpj = scanner.nextLine();
    System.out.println("\nDigite a quantidade maxima de produtos deste fornecedor: ");
    int qntProdutosMax = Integer.parseInt(scanner.nextLine());
    
    Alimento fornecedor1 = new Alimento(
        nomeFornecedor, 
        numeroCnpj, 
        qntProdutosMax);
    
    fornecedor1.addProdutoFornecedor(tipo1Carne);
    fornecedor1.produtosDoFornecedor();
    
    System.out.println("\nDigite o nome do produto:");
    String nomeDoProduto2 = scanner.nextLine();
    System.out.println("\nDescrição do produto: ");
    String descDoProduto2 = scanner.nextLine();
    System.out.println("\nDigite o valor do produto:");
    double valorDoProduto2 = scanner.nextDouble();
    System.out.println("\nDigite a quantidade em estoque: ");
    int qntEstoque2 = Integer.parseInt(scanner.nextLine());
    
    Camisa option1Roupa = new Camisa(
        nomeDoProduto2,
        descDoProduto2,
        valorDoProduto2,
        qntEstoque2);
    
    System.out.println("\nDigite o nome do fornecedor: ");
    String nomeFornecedor2 = scanner.nextLine();
    System.out.println("\ndigite o numero do cnpj: ");
    String numeroCnpj2 = scanner.nextLine();
    System.out.println("\nDigite a quantidade maxima de produtos deste fornecedor: ");
    int qntProdutosMax2 = Integer.parseInt(scanner.nextLine());

    Roupa fornecedor2 = new Roupa(
        nomeFornecedor2, 
        numeroCnpj2, 
        qntProdutosMax2);

    fornecedor2.addProdutoFornecedor(option1Roupa);
    fornecedor2.produtosDoFornecedor();
    
    System.out.println("\nDigite a quantidade de fornecedores dessa gestao: ");
    int qntFornecedores1 = Integer.parseInt(scanner.nextLine());
    Supervisor gestorDeProdutos1 = new Supervisor(qntFornecedores1);

    System.out.println("\nDigite a quantidade de fornecedores dessa gestao: ");
    int qntFornecedores2 = Integer.parseInt(scanner.nextLine());
    Gerente gestorDeProdutos2 = new Gerente(qntFornecedores2);

    gestorDeProdutos1.cadastrarFornecedor(fornecedor1);
    gestorDeProdutos1.exibirInfoFornecedor(fornecedor1.nomeFornecedor);
    
    gestorDeProdutos2.cadastrarFornecedor(fornecedor2);
    gestorDeProdutos2.exibirInfoFornecedor(fornecedor2.nomeFornecedor);

    System.out.println("\nDigite a quantidade de Produtos disponiveis no estoque: ");    
    int qntProdutoNoEstoque = Integer.parseInt(scanner.nextLine());
    Supermercado estoque1 = new Supermercado(qntProdutoNoEstoque);

    System.out.println("\nDigite a quantidade de Produtos disponiveis no estoque: ");
    int qntProdutoNoEstoque2 = Integer.parseInt(scanner.nextLine());
    Shopping estoque2 = new Shopping(qntProdutoNoEstoque2);

    estoque1.adicionarProduto(fornecedor1.produtosFornecedor[0]);
    estoque2.adicionarProduto(fornecedor2.produtosFornecedor[0]);

    estoque1.atualizarProduto(
        fornecedor1.produtosFornecedor[0].idDoProduto, 
        45.89, 
        400);
    
    estoque2.atualizarProduto(
        fornecedor1.produtosFornecedor[0].idDoProduto, 
        1500.46, 
        120);

    estoque1.gerarRelatorio();
    estoque2.gerarRelatorio();

    estoque1.verificarDisponibilidade(tipo1Carne);
    // estoque1.excluirProduto(tipo1Carne);
    
    estoque2.verificarDisponibilidade(option1Roupa);
    // estoque2.excluirProduto(option1Roupa);

    gestorDeProdutos1.exibirInfoProduto(tipo1Carne);
    gestorDeProdutos1.buscarProdPorNome(tipo1Carne.nome);
    gestorDeProdutos1.buscarProdPorID(tipo1Carne.idDoProduto);
    
    gestorDeProdutos2.exibirInfoProduto(option1Roupa);
    gestorDeProdutos2.buscarProdPorNome(option1Roupa.nome);
    gestorDeProdutos2.buscarProdPorID(option1Roupa.idDoProduto);

    scanner.close();
    }    
}