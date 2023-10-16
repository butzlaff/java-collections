package edu.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("João", 1234);
    agendaContatos.adicionarContato("Maria", 1235);
    agendaContatos.adicionarContato("José", 1235);
    agendaContatos.adicionarContato("Ana", 1236);

    // agendaContatos.exibirContato();

    // System.out.println("Pesquisa por nome: " + agendaContatos.pesquisarPorNome("Jo"));
    // System.out.println("Pesquisa por nome: " + agendaContatos.pesquisarPorNome("Ma"));

    // agendaContatos.atualizarContato("João", 1237);
    // agendaContatos.exibirContato();
  }

  public void adicionarContato(String nome, int numero) {
    contatoSet.add(new Contato(nome, numero));
  }

  public void exibirContato() {
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosEncontrados = new HashSet<>();
    for(Contato c : contatoSet) {
      if(c.getNome().startsWith(nome)) {
        contatosEncontrados.add(c);
      }
    }
    return contatosEncontrados;
  }

  public Contato atualizarContato(String nome, int numero) {
    Contato contatoParaAtualizar = null;
    for(Contato c : contatoSet) {
      if(c.getNome().equals(nome)) {
        c.setNumero(numero);
        contatoParaAtualizar = c;
        break;
      }
    }
    return contatoParaAtualizar;
  }
}
