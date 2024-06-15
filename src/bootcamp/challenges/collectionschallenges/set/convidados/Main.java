package bootcamp.challenges.collectionschallenges.set.convidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidado convidados = new ConjuntoConvidado();

        System.out.println("Total de convidados: " + convidados.contarConvidados());
        convidados.adicionarConvidado("Filipe", 1255);
        convidados.adicionarConvidado("Daniel", 5892);
        System.out.println("Total de convidados: " + convidados.contarConvidados());

        convidados.removerConvidadoPorCodigoConvite(4565);
        convidados.removerConvidadoPorCodigoConvite(1255);
        System.out.println("Total de convidados: " + convidados.contarConvidados());

        convidados.exibirConvidados();
    }
}
