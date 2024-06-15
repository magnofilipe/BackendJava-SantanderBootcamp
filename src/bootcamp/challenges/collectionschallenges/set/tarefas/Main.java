package bootcamp.challenges.collectionschallenges.set.tarefas;

import jdk.management.jfr.FlightRecorderMXBean;

public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefas = new ListaTarefa();

        listaTarefas.adicionarTarefa("Limpar a casa");
        listaTarefas.adicionarTarefa("Lavar a varanda");
        listaTarefas.adicionarTarefa("Pintar o muro");

        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaConcluida("Limpar a casa");
        listaTarefas.marcarTarefaConcluida("Lavar a varanda");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.removerTarefa("Pintar o muro");
        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
