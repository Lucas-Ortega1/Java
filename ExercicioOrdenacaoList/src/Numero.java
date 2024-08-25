public class Numero implements Comparable<Numero> {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Numero n) {
        // TODO Auto-generated method stub
        return Integer.compare(numero, n.getNumero());        
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "numero=" + numero +
                '}';
    }

    
}