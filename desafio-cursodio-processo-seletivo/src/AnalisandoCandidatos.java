import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AnalisandoCandidatos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Bem vindo candidato!");
        System.out.println("----------------------------");

        String [] candidatos = {"Felipe", "Ana", "Marcia", "Carlos", "Mateus"};

        for (Object candidato : candidatos) {
            entrandoEmContato((String) candidato);

        }



        //System.out.print("Informe o salario pretendido: ");
        //double salarioPretendido = scanner.nextDouble();


        //analisarCandidato(salarioPretendido);

        //selecionarCandidato();

        //imprimirSelecionados();
        
        scanner.close();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Ana", "Marcia", "Carlos", "Mateus"};

        for (Object candidato : candidatos) {
            System.out.println("O candidato " + candidato + " foi selecionado" );
        }
    }   

    static void selecionarCandidato(){
        String [] candidatos = {"Felipe", "Ana", "Marcia", "Carlos", "Mateus", "Lucas", "Bruna", "Camila", "Gabriel", "Mauricio"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " selecionou este valor: " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendido = false;
        do{
            atendido = atender();
            continuarTentando = !atendido;
            if(continuarTentando){
                tentativasRealizadas++;
            } else{
                System.out.println("Contato realizado com sucesso. ");
            }

        }while (continuarTentando && tentativasRealizadas < 3);

        if (atendido){
            System.out.println("Conseguimos contato com " + candidato);
        } else{
            System.out.println("Nao conseguimos contato com " + candidato + " apos 3 tentativas");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;

        if (salarioPretendido > salarioBase){
            System.out.println("Ligar para o candidato.");
        } else if (salarioPretendido == salarioBase) { 
            System.out.println("Ligar para o candidato com contra proposta.");
        } else{
            System.out.println("Aguardando resultado demais candidatos.");
        }
    }
}
