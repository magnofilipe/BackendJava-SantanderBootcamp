package bootcamp.challenges.collectionschallenges.list.numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int resultado = 0;

        for (Integer soma : numeros) {
            resultado += soma;
        }

        return resultado;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;

        if (numeros.isEmpty()) {
            throw new RuntimeException("Lista vazia.");
        } else {
            for (Integer atual : numeros) {
                if (atual >= maior) {
                    maior = atual;
                }
            }
        }

        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;

        if (numeros.isEmpty()) {
            throw new RuntimeException("Lista vazia.");
        } else {
            for (Integer atual : numeros) {
                if (atual <= menor) {
                    menor = atual;
                }
            }
        }

        return menor;
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("Lista vazia.");
        }
    }
}
