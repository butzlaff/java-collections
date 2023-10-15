package edu.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListTarefa {
  private List<Tarefa> tarefaList;

  public ListTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void addTarefa(String descricao) {
    this.tarefaList.add(new Tarefa(descricao));
  }

  public void removeTarefa(String descricao) {
    List<Tarefa> tarefaParaRemover = new ArrayList<>();
  
    for (Tarefa tarefa : tarefaList) {
      if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefaParaRemover.add(tarefa);
      }
    }
    System.out.println("Tarefa para remover: " + tarefaParaRemover);
    tarefaList.removeAll(tarefaParaRemover);
  }

  public int obterNumeroTotalDeTarefas() {
    return this.tarefaList.size();
  }

  public void obterDescricaoTarefas() {
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListTarefa listTarefa = new ListTarefa();
    System.out.println("Número total de tarefas: " + listTarefa.obterNumeroTotalDeTarefas());

    listTarefa.addTarefa("Estudar Java");
    listTarefa.addTarefa("Estudar Spring");
    listTarefa.addTarefa("Estudar Spring Boot");
    
    System.out.println("Número total de tarefas: " + listTarefa.obterNumeroTotalDeTarefas());
    listTarefa.addTarefa("Estudar Spring Boot");
    
    listTarefa.obterDescricaoTarefas();

    System.out.println("Número total de tarefas: " + listTarefa.obterNumeroTotalDeTarefas());
    
    listTarefa.removeTarefa("Estudar Spring Boot");
    System.out.println("Número total de tarefas: " + listTarefa.obterNumeroTotalDeTarefas());

  }
}
