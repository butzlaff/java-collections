package edu.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
  private String nome;
  private long codigo;
  private int quantidade;
  private double preco;


  public Produto(String nome, long codigo, int quantidade, double preco) {
    this.nome = nome;
    this.codigo = codigo;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  // getters

  public String getNome() {
    return this.nome;
  }

  public long getCodigo() {
    return this.codigo;
  }

  public int getQuantidade() {
    return this.quantidade;
  }

  public double getPreco() {
    return this.preco;
  }

  @Override
  public String toString() {
    return "Produto {" +
        "nome='" + nome + '\'' +
        ", codigo=" + codigo +
        ", quantidade=" + quantidade +
        ", preco=" + preco +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Produto) {
      Produto outroProduto = (Produto) obj;
      return this.codigo == outroProduto.codigo;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCodigo());
  }

  @Override
  public int compareTo(Produto p) {
    return this.nome.compareToIgnoreCase(p.getNome());
  }
}

class ComparatorPorPreco implements Comparator<Produto> {
   @Override
   public int compare(Produto p1, Produto p2) {
     return Double.compare(p1.getPreco(), p2.getPreco());
   }
}
