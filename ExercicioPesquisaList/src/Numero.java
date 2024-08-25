public class Numero{
    private int numero;

    public Numero(int num){
        this.numero = num;
    }

    public int getNumero(){
        return this.numero;
    }

    @Override
    public String toString(){
        return "Numero: " + this.numero;
    }
}