public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esta ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("A TV esta ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.trocarCanal(37);

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar();

        System.out.println("A TV esta ligada? " + smartTv.ligada);        

    }
}
