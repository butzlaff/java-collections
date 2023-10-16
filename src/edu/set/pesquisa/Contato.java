package edu.set.pesquisa;

public class Contato {
  private String nome;
  private int numero;

  public Contato(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
  }

  public String getNome() {
    return this.nome;
  }

  public int getNumero() {
    return this.numero;
  }

  public int setNumero(int numero) {
    return this.numero = numero;
  }

  @Override
  public String toString() {
    return "Contato{" +
        "nome='" + nome + '\'' +
        ", numero=" + numero +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Contato) {
      Contato outroContato = (Contato) obj;
      return this.nome == outroContato.nome;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return this.nome.hashCode();
  }

}
