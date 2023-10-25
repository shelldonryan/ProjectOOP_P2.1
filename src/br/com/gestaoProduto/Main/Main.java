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
import br.com.gestaoProduto.exception.DisponibilidadeException;
import br.com.gestaoProduto.exception.ProdutosException;
import br.com.gestaoProduto.exception.QuantidadeFornecedorException;
import br.com.gestaoProduto.exception.QuantidadeProdutoEstoqueException;
import br.com.gestaoProduto.exception.QuantidadeProdutosFornecedorException;

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
    int qntEstoque = scanner.nextInt();
    scanner.nextLine();

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
    int qntProdutosMax = scanner.nextInt();
    scanner.nextLine();
    
    Alimento fornecedor1 = new Alimento(
        nomeFornecedor, 
        numeroCnpj, 
        qntProdutosMax);
    
    try {
        fornecedor1.addProdutoFornecedor(tipo1Carne);
        fornecedor1.produtosDoFornecedor();
    } catch (QuantidadeProdutosFornecedorException e) {
        System.out.println(e.getMessage());
    } catch (ProdutosException e) {
        System.out.println(e.getMessage());
    }
    
    System.out.println("\nDigite o nome do produto:");
    String nomeDoProduto2 = scanner.nextLine();
    System.out.println("\nDescrição do produto: ");
    String descDoProduto2 = scanner.nextLine();
    System.out.println("\nDigite o valor do produto:");
    double valorDoProduto2 = scanner.nextDouble();
    System.out.println("\nDigite a quantidade em estoque: ");
    int qntEstoque2 = scanner.nextInt();
    scanner.nextLine();
    
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
    int qntProdutosMax2 = scanner.nextInt();
    scanner.nextLine();

    Roupa fornecedor2 = new Roupa(
        nomeFornecedor2, 
        numeroCnpj2, 
        qntProdutosMax2);
    
    try {
        fornecedor2.addProdutoFornecedor(option1Roupa);
        fornecedor2.produtosDoFornecedor();
    } catch (QuantidadeProdutosFornecedorException e) {
        System.out.println(e.getMessage());
    } catch (ProdutosException e) {
        System.out.println(e.getMessage());
    }
    
    
    System.out.println("\nDigite a quantidade de fornecedores dessa gestao: ");
    int qntFornecedores1 = scanner.nextInt();
    scanner.nextLine();
    Supervisor gestorDeProdutos1 = new Supervisor(qntFornecedores1);

    System.out.println("\nDigite a quantidade de fornecedores dessa gestao: ");
    int qntFornecedores2 = scanner.nextInt();
    scanner.nextLine();
    Gerente gestorDeProdutos2 = new Gerente(qntFornecedores2);

    try {
        gestorDeProdutos1.cadastrarFornecedor(fornecedor1);
        gestorDeProdutos1.exibirInfoFornecedor(fornecedor1.nomeFornecedor);
        System.out.println("\nFornecedor Cadastrado");
    } catch (QuantidadeFornecedorException e) {
        System.out.println(e.getMessage());
    }
    
    try {
        gestorDeProdutos2.cadastrarFornecedor(fornecedor2);
        gestorDeProdutos2.exibirInfoFornecedor(fornecedor2.nomeFornecedor);
        System.out.println("\nFornecedor Cadastrado");
    } catch (QuantidadeFornecedorException e) {
        System.out.println(e.getMessage());
    }

    System.out.println("\nDigite a quantidade de Produtos disponiveis no estoque: ");    
    int qntProdutoNoEstoque = scanner.nextInt();
    scanner.nextLine();
    Supermercado estoque1 = new Supermercado(qntProdutoNoEstoque);

    System.out.println("\nDigite a quantidade de Produtos disponiveis no estoque: ");
    int qntProdutoNoEstoque2 = scanner.nextInt();
    scanner.nextLine();
    Shopping estoque2 = new Shopping(qntProdutoNoEstoque2);

    try {
        estoque1.adicionarProduto(fornecedor1.produtosFornecedor[0]);
        System.out.println("\nProduto " + fornecedor1.produtosFornecedor[0].nome + " Adicionado com Sucesso");
    } catch (QuantidadeProdutoEstoqueException e) {
        System.out.println(e.getMessage());
    }

    try {
        estoque2.adicionarProduto(fornecedor2.produtosFornecedor[0]);
    } catch (QuantidadeProdutoEstoqueException e) {
        System.out.println(e.getMessage());
        System.out.println("\nProduto " + fornecedor2.produtosFornecedor[0].nome + " Adicionado com Sucesso");
    }
    
    try {
        estoque1.atualizarProduto(
        fornecedor1.produtosFornecedor[0].idDoProduto, 
        45.89, 
        400);
    } catch (ProdutosException e) {
        System.out.println(e.getMessage());
    }
    
    try {
        estoque2.atualizarProduto(
        fornecedor1.produtosFornecedor[0].idDoProduto, 
        1500.46, 
        120);
    } catch (ProdutosException e) {
        System.out.println(e.getMessage());
    }
    

    estoque1.gerarRelatorio();
    estoque2.gerarRelatorio();

    try {
        estoque1.verificarDisponibilidade(tipo1Carne);
        // estoque1.excluirProduto(tipo1Carne);
    } catch (DisponibilidadeException e) {
        System.out.println(e.getMessage());
    }
    
    try {
        estoque2.verificarDisponibilidade(option1Roupa);
        // estoque2.excluirProduto(option1Roupa);
    } catch (DisponibilidadeException e) {
        System.out.println(e.getMessage());
    } catch (ProdutosException e) {
        System.out.println(e.getMessage());
    }

    try {
        gestorDeProdutos1.exibirInfoProduto(tipo1Carne);
        gestorDeProdutos1.buscarProdPorNome(tipo1Carne.nome);
        gestorDeProdutos1.buscarProdPorID(tipo1Carne.idDoProduto);
    } catch (QuantidadeFornecedorException e) {
        System.out.println(e.getMessage());
    } catch (ProdutosException e) {
        System.out.println(e.getMessage());
    }
    
    try {
        gestorDeProdutos2.exibirInfoProduto(option1Roupa);
        gestorDeProdutos2.buscarProdPorNome(option1Roupa.nome);
        gestorDeProdutos2.buscarProdPorID(option1Roupa.idDoProduto);
    } catch (QuantidadeFornecedorException e) {
        System.out.println(e.getMessage());
    } catch (ProdutosException e) {
        System.out.println(e.getMessage());
    }
   

    scanner.close();
    }    
}