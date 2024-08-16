import java.util.Scanner;

public class ContPar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        int contPar = 0;

        for (num1 = 0; num1 < num2; num1++) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
                contPar++;
            } else {
                System.out.println(num1);
            }
        }

        System.out.println("Total de numeros pares:" + contPar);

    }
}
