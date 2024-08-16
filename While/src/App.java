import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, mundo!");

        while (num <= 5){
            System.out.println(num);
            num++;
        }

        System.out.println("Sai da repeticao");


        scanner.close();
    }
}
