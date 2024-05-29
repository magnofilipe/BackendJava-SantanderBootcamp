package bootcamp.collectionschallenges.set.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidados;

    public ConjuntoConvidado() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!convidados.isEmpty()) {
            for (Convidado c : convidados) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidados.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("Conjunto vazio.");
        }
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        if (!convidados.isEmpty()) {
            System.out.println(convidados);
        } else {
            System.out.println("Conjunto vazio.");
        }
    }
}
