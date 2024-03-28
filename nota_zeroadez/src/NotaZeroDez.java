import java.util.Scanner;

public class NotaZeroDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        boolean notaValida;

        do {
            
         System.out.println("Insira uma nota de zero a dez: ");
            nota = scanner.nextDouble();
            notaValida = (nota >= 0 && nota <= 10);

            if (!notaValida) {
                System.out.println("Nota invalida! O valor deve estar entre zero e dez! ");
            }
        } while (!notaValida);

        System.out.println("Nota Válida: " +nota );

        scanner.close();
    }
    
}
