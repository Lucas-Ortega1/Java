import java.util.Scanner;

public class TestandoSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String sigla;

        System.out.print("Digite o tamanho (P/M/G): ");
        sigla = scanner.nextLine();

        switch (sigla) {
            case "P":{
              System.out.println("PEQUENO");
              break;
            }
            case "M":{
              System.out.println("MÉDIO");
              break;
            }
            case "G":{
              System.out.println("GRANDE");
              break;
            }
            default:
            System.out.println("Sigla inválida!");
        }

    }
}
