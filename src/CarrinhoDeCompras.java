import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item (nome, preco, quantidade);
        this.carrinhoList.add(item);
    }


    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if(!carrinhoList.isEmpty()){
            for(Item i : carrinhoList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(i);
                }
            }
            carrinhoList.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista não contém itens para remover!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!carrinhoList.isEmpty()){
            for(Item item : carrinhoList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens(){
        if(!carrinhoList.isEmpty()){
            System.out.println(this.carrinhoList);
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "carrinhoList=" + carrinhoList +
                '}';
    }
}
