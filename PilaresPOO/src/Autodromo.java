public class Autodromo {
    public static void main(String[] args) throws Exception {
        
        Carro jeep = new Carro();

        jeep.ligar();
        jeep.setChassi("ABC123");

        Moto z400 = new Moto();        
        z400.ligar();
        z400.setChassi("DEF456");

        

    }
}
