package edu.set.operacaobasica;

import java.util.Objects;

public class Convidado {
  private String nome;
  private int codigoConvite;

  public Convidado(String nome, int codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  @Override
  public String toString() {
    return "Convidado{" +
        "nome='" + nome + '\'' +
        ", codigoConvite=" + codigoConvite +
        '}';
  }
  
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Convidado) {
      Convidado outroConvidado = (Convidado) obj;
      return this.codigoConvite == outroConvidado.codigoConvite;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCodigoConvite());
  }

  public String getNome() {
    return nome;
  }

  public int getCodigoConvite() {
    return codigoConvite;
  }
}
