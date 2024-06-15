package bootcamp.poo_project.dominio;

public class Curso extends Conteudo {
    // Não preciso dos atributos título e descrição porque foram herdados.
    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        // XP Padrão da superclasse com um acréscimo específico de um Curso.
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        // Aqui usamos get.
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
