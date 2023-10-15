package edu.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa(List<Pessoa> pessoaList) {
    this.pessoaList = pessoaList;
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    Pessoa novaPessoa = new Pessoa(nome, idade, altura);
    this.pessoaList.add(novaPessoa);
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
  }

  public static void main(String[] args) {
    List<Pessoa> pessoas = new ArrayList<>();
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa(pessoas);

    ordenacaoPessoa.adicionarPessoa("João", 20, 1.80);
    ordenacaoPessoa.adicionarPessoa("Maria", 18, 1.70);
    ordenacaoPessoa.adicionarPessoa("José", 25, 1.90);
    ordenacaoPessoa.adicionarPessoa("Ana", 22, 1.75);

    System.out.println("Ordenação por idade:");
    for (Pessoa pessoa : ordenacaoPessoa.ordenarPorIdade()) {
      System.out.println(pessoa);
    }

    System.out.println("\nOrdenação por altura:");
    for (Pessoa pessoa : ordenacaoPessoa.ordenarPorAltura()) {
      System.out.println(pessoa);
    }
  }
}
