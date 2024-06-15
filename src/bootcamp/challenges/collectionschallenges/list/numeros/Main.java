package bootcamp.challenges.collectionschallenges.list.numeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(3);

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());

        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número " + somaNumeros.encontrarMenorNumero());

        System.out.print("Números existentes: ");
        somaNumeros.exibirNumeros();


    }
}
