package edu.set.operacaobasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  private Set<Convidado> convidados;

  public ConjuntoConvidados() {
    this.convidados = new HashSet<>();
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());

    conjuntoConvidados.adicionarConvidado("João", 1234);
    conjuntoConvidados.adicionarConvidado("Maria", 1235);
    conjuntoConvidados.adicionarConvidado("José", 1235);
    conjuntoConvidados.adicionarConvidado("Ana", 1236);
    
    // conjuntoConvidados.removerConvidado(1234);

    System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());

    // conjuntoConvidados.exibirConvidados();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    convidados.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidado(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    for(Convidado c : convidados) {
      if(c.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = c;
        break;
      }
    }
    if(convidadoParaRemover != null) {
      convidados.remove(convidadoParaRemover);
    }
  }

  public int contarConvidados() {
    return convidados.size();
  }

  public void exibirConvidados() {
    System.out.println("Lista de convidados:");
    for(Convidado c : convidados) {
      System.out.println(c);
    }
  }
}
