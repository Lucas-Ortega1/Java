import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Digite seu CPF: ");
            String cpf = scanner.next();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Minha idade eh: " + idade);
            System.out.println("Minha altura eh: " + altura + " metros");
            System.out.println("Meu CPF eh: " + cpf);

            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e akltura precisam ser numericos!");
        }
    }
}
