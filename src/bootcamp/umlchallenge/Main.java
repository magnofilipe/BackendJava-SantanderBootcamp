package bootcamp.umlchallenge;

import bootcamp.umlchallenge.interfaces.AparelhoTelefonico;
import bootcamp.umlchallenge.interfaces.NavegadorInternet;
import bootcamp.umlchallenge.interfaces.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {

        IPhone iphone = new IPhone();
        AparelhoTelefonico telefone = new IPhone();
        NavegadorInternet navegador = new IPhone();
        ReprodutorMusical reprodutor = new IPhone();

        System.out.println("\nTESTANDO INTERFACE E CLASSE QUE A IMPLEMENTA");
        iphone.ligar("895623120094");
        telefone.ligar("835913419521");

        iphone.atender();
        telefone.atender();

        iphone.iniciarCorreioVoz();
        telefone.iniciarCorreioVoz();

        System.out.println("\nTESTANDO TODAS AS FUNCIONALIDADES RESTANTES");
        iphone.adicionarNovaAba();
        iphone.pausar();
        iphone.exibirPagina("https://github.com/magnofilipe");
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.selecionarMusica("Alceu Valença - Girassol");
    }
}
