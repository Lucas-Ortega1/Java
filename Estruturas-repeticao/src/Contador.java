import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        int i;
        int contador;

        System.out.print("Informe o numero de repeticoes: ");
        contador = scanner.nextInt();

        for(i=1;i<=contador;i++){
            System.out.println(i);
        }

        System.out.println("Terminei a execucao!");

        scanner.close();

    }
}
