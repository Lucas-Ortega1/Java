import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        double saldo = 100;
        double valor_solicitado = 0;

        System.out.println("Saldo atualizado: " + saldo);
        System.out.print("Digite o valor do saque: ");
        valor_solicitado = scanner.nextDouble();

        if (saldo >= valor_solicitado) {
            saldo -= valor_solicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Saldo atual: " + saldo);

        scanner.close();
    }
}
