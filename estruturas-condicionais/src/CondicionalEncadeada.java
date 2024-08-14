import java.util.Scanner;

public class CondicionalEncadeada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Bem vindo ao resultado da prova final");
        System.out.println("---------------------------------------");

        System.out.println("Digite a sua nota final: ");
        double notaFinal = scanner.nextDouble();

        if (notaFinal < 6 ){
            System.out.println("Reprovado");
        } else if (notaFinal >= 6 && notaFinal <7) {
            System.out.println("Recuperação");
        } else if (notaFinal >= 7){
            System.out.println("Aprovado");
        }

        scanner.close();

    }
}
