package edu.set.ordenacao;

import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
  private Set<Produto> produtoSet;

  public CadastroProduto(Set<Produto> produtoSet) {
    this.produtoSet = produtoSet;
  }

  public void adicionarProduto(String nome, double preco, int quantidade, long codigo) {
    produtoSet.add(new Produto(nome, codigo, quantidade, preco));
  }
  
  public Set<Produto> exibiProdutos() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
  }

  public Set<Produto> exibiProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtoSet);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    Set<Produto> produtoSet = new TreeSet<>();
    CadastroProduto cadastroProduto = new CadastroProduto(produtoSet);

    cadastroProduto.adicionarProduto("Arroz", 10.0, 10, 1);
    cadastroProduto.adicionarProduto("Feijão", 5.0, 10, 2);
    cadastroProduto.adicionarProduto("Macarrão", 3.0, 10, 3);
    cadastroProduto.adicionarProduto("Açúcar", 2.0, 10, 4);

    System.out.println("Produtos ordenados por nome:");
    System.out.println(cadastroProduto.exibiProdutos());

    // System.out.println("Produtos ordenados por preço:");
    // System.out.println(cadastroProduto.exibiProdutosPorPreco());
  }
  
}
