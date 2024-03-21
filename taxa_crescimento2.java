import java.util.Scanner;

public class taxa_crescimento2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner para entrada de dados

        char continuar; // Variável para verificar se o usuário deseja continuar

        do {
            // Solicita ao usuário que insira as populações e as taxas de crescimento
            System.out.println("Informe a população do país A:");
            int populacaoA = validarPopulacao(scanner); // Valida a população do país A

            System.out.println("Informe a população do país B:");
            int populacaoB = validarPopulacao(scanner); // Valida a população do país B

            System.out.println("Informe a taxa de crescimento anual do país A (em decimal):");
            double crescimentoA = validarTaxa(scanner); // Valida a taxa de crescimento para o país A

            System.out.println("Informe a taxa de crescimento anual do país B (em decimal):");
            double crescimentoB = validarTaxa(scanner); // Valida a taxa de crescimento para o país B

            int anos = calcularAnos(populacaoA, populacaoB, crescimentoA, crescimentoB); // Calcula o número de anos necessários

            // Exibe o resultado
            System.out.println("Após " + anos + " anos, a população do país A ultrapassará ou igualará a população do país B.");

            // Verifica se o usuário deseja continuar
            System.out.println("Deseja repetir a operação? (S/N)");
            continuar = scanner.next().charAt(0); // Lê a resposta do usuário
        } while (continuar == 'S' || continuar == 's'); // Repete a operação se a resposta for 'S' ou 's'

        scanner.close(); // Fecha o objeto Scanner para liberar recursos
    }

    // Método para validar a entrada da população (deve ser um valor inteiro positivo)
    public static int validarPopulacao(Scanner scanner) {
        int populacao;
        do {
            while (!scanner.hasNextInt()) { // Verifica se o próximo token não é um inteiro
                System.out.println("Por favor, insira um valor inteiro positivo:");
                scanner.next(); // Descarta a entrada inválida
            }
            populacao = scanner.nextInt();
            if (populacao <= 0) { // Verifica se a população é positiva
                System.out.println("Por favor, insira um valor inteiro positivo:");
            }
        } while (populacao <= 0); // Continua pedindo a população enquanto for menor ou igual a zero
        return populacao;
    }

    // Método para validar a entrada da taxa de crescimento (deve ser um valor double entre 0 e 1)
    public static double validarTaxa(Scanner scanner) {
        double taxa;
        do {
            while (!scanner.hasNextDouble()) { // Verifica se o próximo token não é um double
                System.out.println("Por favor, insira um valor decimal entre 0 e 1:");
                scanner.next(); // Descarta a entrada inválida
            }
            taxa = scanner.nextDouble();
            if (taxa <= 0 || taxa >= 1) { // Verifica se a taxa está entre 0 e 1
                System.out.println("Por favor, insira um valor decimal entre 0 e 1:");
            }
        } while (taxa <= 0 || taxa >= 1); // Continua pedindo a taxa enquanto estiver fora do intervalo válido
        return taxa;
    }

    // Método para calcular o número de anos necessários para que a população de A ultrapasse ou iguale a população de B
    public static int calcularAnos(int populacaoA, int populacaoB, double crescimentoA, double crescimentoB) {
        int anos = 0;
        while (populacaoA < populacaoB) {
            // Calcula o crescimento populacional para cada país no próximo ano
            populacaoA += (int) (populacaoA * crescimentoA);
            populacaoB += (int) (populacaoB * crescimentoB);
            anos++; // Incrementa o contador de anos
        }
        return anos;
    }
}
  