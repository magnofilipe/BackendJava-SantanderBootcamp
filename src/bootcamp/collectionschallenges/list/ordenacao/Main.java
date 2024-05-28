package bootcamp.collectionschallenges.list.ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Filipe", 20, 1.75);
        ordenacaoPessoas.adicionarPessoa("Lucas", 21, 1.73);
        ordenacaoPessoas.adicionarPessoa("João", 17, 1.68);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }

}
