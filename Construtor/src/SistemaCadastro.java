import java.util.Scanner;

public class SistemaCadastro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite seu cpf");
        String cpf = scanner.nextLine();

        System.out.println("Digite seu endereço");
        String endereco = scanner.nextLine();

        Pessoa pessoa1 = new Pessoa(nome, cpf, endereco);

        System.out.println("--------------------------------------");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("CPF: " + pessoa1.getCpf());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("--------------------------------------");

        scanner.close();

    }
    
}
