import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numero> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero)); 
    }

    public List<Numero> ordenarAscendente(){
        List<Numero> crescenteLista = new ArrayList<>(numeroList);
        Collections.sort(crescenteLista);
        return crescenteLista;
    }

    public List<Numero> ordenarDecrescente(){
        List<Numero> decrescenteLista = new ArrayList<>(numeroList);
        decrescenteLista.sort(Comparator.reverseOrder());
        return decrescenteLista;
    }


    public static void main(String[] args) {
        
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();

        // Adicionando números
        ordenacao.adicionarNumero(10);
        ordenacao.adicionarNumero(5);
        ordenacao.adicionarNumero(3);
        ordenacao.adicionarNumero(7);

        System.out.println("Ordenacao crescente: ");
        System.out.println(ordenacao.ordenarAscendente());


        System.out.println("Ordenacao decrescente: ");
        System.out.println(ordenacao.ordenarDecrescente());

    }
}
