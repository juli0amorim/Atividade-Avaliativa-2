import java.util.Scanner;

public class EstadoCivil {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Digite seu nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.println("Digite sua idade (maior que 0 e menor que 150); ");
            idade = scanner.nextInt();
        } while (idade <= 0 || idade > 150 ); 
            
        do {
            System.out.println("Digite o seu salário (maior que 0); ");
            salario = scanner.nextDouble();
        } while (salario <= 0);
        
        do {
            System.out.println("Digite o seu sexo ('f' para feminino e 'm' para masculino): ");
            sexo = scanner.next().toLowerCase();
        } while (!sexo.equals("f") && !sexo.equals("m")); 
        
        do {
            System.out.println("Digite o seu estado civil ('s' 'c' 'd' 'v')");
            estadoCivil = scanner.next().toLowerCase();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        System.out.println("Informações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}
