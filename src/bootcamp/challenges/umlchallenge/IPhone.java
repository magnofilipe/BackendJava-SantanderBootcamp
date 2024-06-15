package bootcamp.challenges.umlchallenge;

import bootcamp.challenges.umlchallenge.interfaces.AparelhoTelefonico;
import bootcamp.challenges.umlchallenge.interfaces.NavegadorInternet;
import bootcamp.challenges.umlchallenge.interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    // ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música!");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada.");
    }

    // NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Página " + url + " sendo exibida.");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atual atualizada.");
    }

    // AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
}
