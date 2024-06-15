package bootcamp.poo_project.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    // Não preciso dos atributos título e descrição porque foram herdados.
    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        // XP Padrão da superclasse com um acréscimo específico de uma Mentoria.
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        // Aqui usamos get.
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
