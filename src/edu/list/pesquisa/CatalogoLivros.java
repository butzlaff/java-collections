package edu.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {


  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    Livro novoLivro = new Livro(titulo, autor, anoPublicacao);
    this.livroList.add(novoLivro);
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> listPorAutor = new ArrayList<>();
    if(!livroList.isEmpty()) {
      for (Livro livro : livroList) {
        if(livro.getAutor().equalsIgnoreCase(autor)) {
          listPorAutor.add(livro);
        }
      }
    }
    return listPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal) {
    List<Livro> listPorIntervaloDeAnos = new ArrayList<>();
    if(!livroList.isEmpty()) {
      for (Livro livro : livroList) {
        if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
          listPorIntervaloDeAnos.add(livro);
        }
      }
    }
    return listPorIntervaloDeAnos;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if(!livroList.isEmpty()) {
      for (Livro livro : livroList) {
        if(livro.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = livro;
          break;
        }
      }
    }
    return livroPorTitulo;
  }

  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    catalogoLivros.adicionarLivro("Harry Potter", "J. K. Rowling", 1997);
    catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
    catalogoLivros.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
    catalogoLivros.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
    catalogoLivros.adicionarLivro("O Hobbit", "J. R. R. Tolkien", 1937);
    catalogoLivros.adicionarLivro("O Código Da Vinci", "Dan Brown", 2003);
    catalogoLivros.adicionarLivro("A Menina que Roubava Livros", "Markus Zusak", 2005);
    catalogoLivros.adicionarLivro("O Alquimista", "Paulo Coelho", 1988);

    // pesquisar por autor

    List<Livro> livrosPorAutor = catalogoLivros.pesquisarPorAutor("J. R. R. Tolkien");
    System.out.println("Livros por autor:");
    for (Livro livro : livrosPorAutor) {
      System.out.println(livro);
    }

    // pesquisar por intervalo de anos

    List<Livro> livrosPorIntervaloDeAnos = catalogoLivros.pesquisarPorIntervaloDeAnos(1900, 2000);
    System.out.println("Livros por intervalo de anos:");
    for (Livro livro : livrosPorIntervaloDeAnos) {
      System.out.println(livro);
    }

    // pesquisar por título

    Livro livroPorTitulo = catalogoLivros.pesquisarPorTitulo("O Pequeno Príncipe");
    System.out.println("Livro por título:");
    System.out.println(livroPorTitulo);
    
  }
}
