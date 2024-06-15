package bootcamp.challenges.collectionschallenges.set.tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }

        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Conjunto vazio.");
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setTarefaConcluida(true);
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isTarefaConcluida()) {
                tarefaParaMarcarComoPendente.setTarefaConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }


    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> resultado = new HashSet<>();

        for (Tarefa t : tarefaSet) {
            if (t.isTarefaConcluida()) {
                resultado.add(t);
            }
        }

        return resultado;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> resultado = new HashSet<>();

        for (Tarefa t : tarefaSet) {
            if (!t.isTarefaConcluida()) {
                resultado.add(t);
            }
        }

        return resultado;
    }

    public void limparListaTarefas() {
        if (!tarefaSet.isEmpty()) {
            tarefaSet.clear();
        } else {
            System.out.println("Conjunto vazio.");
        }
    }
}
