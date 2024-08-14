public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (volume >=  100) {
            volume = 100;
        } else {
            volume++;
        }
        System.out.println("Volume atual: " + volume);  
    }

    public void diminuirVolume() {
        if (volume <= 0) {
            volume = 0;
        } else {
            volume--;
        }
        System.out.println("Volume atual: " + volume);  
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void trocarCanal(int NovoCanal) {
        if (canal >= 1 && canal <= 500) {
            this.canal = NovoCanal;
        } else {
            System.out.println("Canal inválido!");
        }
    }

}
