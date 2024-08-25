import java.util.ArrayList;
import java.util.List;

public class ListaCompras {
    private List<Compra> comprasLista;

    public ListaCompras() {
        this.comprasLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Compra compra = new Compra(nome, preco, quantidade);
        this.comprasLista.add(compra);
    }

    public void removerItem(String nome){
        if(!comprasLista.isEmpty()){
            for(Compra compra : this.comprasLista){
                if(compra.getNome().equalsIgnoreCase(nome)){
                    this.comprasLista.remove(compra);
                    break;
                }
            }
        } else{
            throw new IllegalStateException("A lista de compras está vazia.");
        }
    }

    public double calcularTotal(){
        if(!comprasLista.isEmpty()){
            double total = 0;
            for(Compra compra : comprasLista){
                total += compra.getPreco() * compra.getQuantidade();
            }
            return total;
        }   else{
            throw new IllegalStateException("A lista de compras está vazia.");
        }

    }

    public void exibirItens(){
        System.out.println(comprasLista);
    }

    public static void main(String[] args) {
        
        ListaCompras listaCompras = new ListaCompras();

        listaCompras.adicionarItem("Arroz", 4.5, 2);
        listaCompras.adicionarItem("Feijão", 3.0, 3);
        listaCompras.adicionarItem("Batata", 2.5, 1);
        
        System.out.println("Itens na lista:");
        listaCompras.exibirItens();

        System.out.println("Total da compra: " + listaCompras.calcularTotal());

        listaCompras.removerItem("Feijão");

        System.out.println("Total da compra: " + listaCompras.calcularTotal());
        System.out.println("Itens na lista:");
        listaCompras.exibirItens();
    }

}
