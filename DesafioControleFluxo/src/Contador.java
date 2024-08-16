import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro numero inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo numero inteiro:");
            int numero2 = scanner.nextInt();

            int contador = 1;

            criandoInteracoes(numero1, numero2, contador);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void criandoInteracoes(int numero1, int numero2, int contador) throws ParametrosInvalidosException {

        if(numero1 > numero2){
            throw new ParametrosInvalidosException("O segundo numero deve ser maior que o primeiro.");
        }
        for(int i = numero1; i <= numero2; i++){
            System.out.println("Imprimindo a interacao numero: " + contador);
            contador++;
        }
    }
    
}

