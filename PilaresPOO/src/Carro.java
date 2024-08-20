public class Carro extends Veiculo {
    
    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("O carro está ligado.");
    }

    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio(){
        System.out.println("Conferindo cambio");
    }

}
