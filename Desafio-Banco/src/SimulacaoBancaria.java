import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        System.out.println("----------------------------------");
        System.out.println("Bem vindo ao sistema do banco");
        System.out.println("----------------------------------");

        while (continuar) {

            System.out.println("MENU");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir Saldo");
            System.out.println("0 - Sair");

            System.out.print("Digite a opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor a ser adicionado");
                    double deposito = scanner.nextDouble();
                    saldo = depositarSaldo(saldo, deposito);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.print("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    saldo = sacarSaldo(saldo, saque);
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    exibeSaldo(saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
    
    static double depositarSaldo(double saldo, double deposito){
      saldo = saldo + deposito;
      return saldo;
    }

    static double sacarSaldo(double saldo, double saque){
        if(saque <= saldo){
            saldo = saldo - saque;
            return saldo;
        } else {
            System.out.println("Saldo insuficiente!");
            return saldo;
        }
    }

    static void exibeSaldo(double saldo){
        System.out.println("Seu saldo é: " + saldo);
    }
    
}