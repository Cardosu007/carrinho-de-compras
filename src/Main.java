public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras c = new CarrinhoDeCompras();

        c.adicionarItem("Leite", 4.00f, 3);
        c.adicionarItem("Papel Higienico", 20.00f, 1);
        c.adicionarItem("Chocolate", 5.00f, 2);
        c.adicionarItem("Carne", 25.00f, 1);
        c.adicionarItem("Óleo", 7.00f, 6);
        c.adicionarItem("Água", 2.00f, 20);

        c.exibirItens();

    }
}