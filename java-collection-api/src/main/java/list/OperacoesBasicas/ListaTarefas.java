package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList = new ArrayList();

    public ListaTarefas() {
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList();
        Iterator var3 = this.tarefaList.iterator();

        while(var3.hasNext()) {
            Tarefa t = (Tarefa)var3.next();
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        this.tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(this.tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Python");
        listaTarefas.adicionarTarefa("Estudar ");
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removerTarefa("Estudar Java");
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
        listaTarefas.obterNumeroTotalTarefas();
    }
}