package bootcamp.challenges.collectionschallenges.list.ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Filipe", 20, 1.75);
        ordenacaoPessoas.adicionarPessoa("Lucas", 21, 1.73);
        ordenacaoPessoas.adicionarPessoa("João", 17, 1.68);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(14);
        ordenacaoNumeros.adicionarNumero(7);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

        ordenacaoNumeros.exibirNumeros();
    }

}
