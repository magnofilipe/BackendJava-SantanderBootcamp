package bootcamp.challenges.collectionschallenges.list.tarefas;

public class Main {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Limpar a casa.");
        listaTarefas.adicionarTarefa("Pintar o muro.");
        listaTarefas.adicionarTarefa("Fazer um pix!");
        listaTarefas.adicionarTarefa("Limpar a casa.");

        System.out.println("Total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Limpar a casa.");

        System.out.println("Total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }
}
