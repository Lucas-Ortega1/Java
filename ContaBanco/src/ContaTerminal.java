import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("Ola! Bem vindo ao banco, vamos criar sua conta?");
        System.out.println("------------------------------------------------");

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o numero da sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Conta criada com sucesso!");
        System.out.println("Ola " + nome + " obrigado por criar uma conta em nosso banco, sua agencia eh " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque.");

        scanner.close();
    }
}
