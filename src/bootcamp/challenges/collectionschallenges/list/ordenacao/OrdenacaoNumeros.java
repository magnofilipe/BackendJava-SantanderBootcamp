package bootcamp.challenges.collectionschallenges.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosOrdenadosAscendente = new ArrayList<>(numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(numerosOrdenadosAscendente);
            return numerosOrdenadosAscendente;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdenadosDescendente = new ArrayList<>(numeros);
        if (!numeros.isEmpty()) {
            numerosOrdenadosDescendente.sort(Collections.reverseOrder());
            return numerosOrdenadosDescendente;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("Lista vazia.");
        }
    }
}
