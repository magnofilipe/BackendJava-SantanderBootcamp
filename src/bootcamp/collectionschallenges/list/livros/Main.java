package bootcamp.collectionschallenges.list.livros;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogoLivros.adicionarLivro("Sherlock Holmes", "Sir Arthur Conan Doyle", 1854);
        catalogoLivros.adicionarLivro("FMCC", "Judith Gersting", 2016);

        System.out.println(catalogoLivros.pesquisarPorTitulo("Filipe e suas aventuras"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("FMCC"));

        System.out.println(catalogoLivros.pesquisarPorAutor("Sir Arthur Conan Doyle"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1940, 2024));
    }
}
