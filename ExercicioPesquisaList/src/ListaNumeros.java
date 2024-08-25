import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    private List<Numero> listaNumeros;

    public ListaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumeros(int numero) {
        listaNumeros.add(new Numero(numero));
    }

    public int calcularSoma() {
        int soma = 0;
        for(Numero n : listaNumeros){
            soma += n.getNumero();
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        for(Numero n : listaNumeros){
            if(n.getNumero() > maior){
                maior = n.getNumero();
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        for(Numero n : listaNumeros){
            if(n.getNumero() < menor){
                menor = n.getNumero();
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        ListaNumeros lista = new ListaNumeros();

        lista.adicionarNumeros(10);
        lista.adicionarNumeros(20);
        lista.adicionarNumeros(30);
        lista.adicionarNumeros(40);
        lista.adicionarNumeros(50);

        System.out.println("Soma dos numeros: " + lista.calcularSoma());
        System.out.println("Maior numero: " + lista.encontrarMaiorNumero());
        System.out.println("Menor numero: " + lista.encontrarMenorNumero());

        System.out.println("Minha lista de numeros: ");
        lista.exibirNumeros();
        
    }

}
