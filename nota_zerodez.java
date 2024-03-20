import java.util.Scanner;

public class nota_zerodez {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double nota; // Variável para armazenar a nota oferecida pelo usuário
        
        // Loop para continua pedindo nota ate que o valor seja válido
        do {
            System.out.println("Digite uma nota de zero a dez: ");
            nota = scanner.nextDouble();// Lê a nota fornecida pelo usuário

            // Verifica se a nota esta dentro do intervalo válido (Entre zero e Dez)
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Por favor digite uma nota de zero a dez: ");
            }
        } while (nota < 0 || nota > 10); // Continua pedindo nota se o valor for inválido
        
        System.out.println("Nota válida: " +nota);

        scanner.close();
    }

}