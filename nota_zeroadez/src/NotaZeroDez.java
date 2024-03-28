import java.util.Scanner;

public class NotaZeroDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota; 

        do {
            System.out.println("Insira uma nota de zero a dez: ");
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota Inválida!");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota Válida!");

        scanner.close();
    }
    
}
