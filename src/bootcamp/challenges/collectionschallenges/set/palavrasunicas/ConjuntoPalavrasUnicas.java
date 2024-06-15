package bootcamp.challenges.collectionschallenges.set.palavrasunicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            if (palavras.contains(palavra)) {
                palavras.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada.");
            }
        } else {
            System.out.println("Conjunto vazio.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavras.isEmpty()) {
            System.out.println(palavras);
        } else {
            System.out.println("Conjunto vazio.");
        }
    }

    public Set<String> getPalavras() {
        return palavras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(palavras, that.palavras);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("Swift");

        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
