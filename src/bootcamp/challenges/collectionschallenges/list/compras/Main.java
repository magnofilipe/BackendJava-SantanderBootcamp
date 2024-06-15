package bootcamp.challenges.collectionschallenges.list.compras;

public class Main {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("Tomate", 3.50, 2);
        carrinhoDeCompras.adicionarItem("Leite em pó", 3.0, 1);
        carrinhoDeCompras.adicionarItem("Tomate", 3.50, 5);

        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Tomate");

        carrinhoDeCompras.exibirItens();
    }


}
