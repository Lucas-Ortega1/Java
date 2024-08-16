import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String resp;

        do { 
            
            System.out.println("Este e o nosso teste");
            System.out.println("Deseja continuar?(sim/nao): ");
            resp = scanner.nextLine().toLowerCase();

        } while (!resp.equalsIgnoreCase("nao"));

        scanner.close();
        System.out.println("saimos do loop");

    }
}
