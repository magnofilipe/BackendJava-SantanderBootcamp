package bootcamp.challenges.collectionschallenges.list.ordenacao;

import bootcamp.challenges.collectionschallenges.list.ordenacao.Pessoa.ComparatorPorAltura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> ordenaPessoasIdade = new ArrayList<>(pessoas); // Coloca a lista toda aqui, para ordenar.
        Collections.sort(ordenaPessoasIdade); // Comparable, em Pessoa.java, agindo agora.
        return ordenaPessoasIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordenaPessoasAltura = new ArrayList<>(pessoas);
        Collections.sort(ordenaPessoasAltura, new ComparatorPorAltura());
        return ordenaPessoasAltura;
    }
}
