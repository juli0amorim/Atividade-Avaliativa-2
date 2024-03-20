import java.util.Scanner;

public class nome_estadocivil {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String nome;
    int idade;
    double salario;
    char sexo;
    char estadoCivil;

    // Validação do nome
    do{
      System.out.println("Digite seu nome (Deve conter mais de 3 caracteres): ");
      nome = scanner.nextLine();
    } while (nome.length() <=3);

    // Validação da idade
    do {
      System.out.println("Digite sua idade (entre 0 e 150): ");
      idade = scanner.nextInt();
    } while (idade < 0 || idade > 150 );

    // Validação do salário
    do {
      System.out.println("Digite seu salário (maior que zero):");
      salario = scanner.nextDouble();
    } while (salario <= 0);

    // Validação do sexo
    do {
      System.out.println("Digite seu sexo 'f para feminino e 'm' para masculino: ");
      sexo = scanner.next().charAt(0);
    } while (sexo != 'f' && sexo != 'm'); 

    // Validação do estado civil
    do {
      System.out.println("Digite seu estado civil ('s' para solteiro, 'c' para casado, 'v' para viúvo, 'd' para divorciado):" );
      estadoCivil = scanner.next().charAt(0);
    } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

    System.out.println("Informações válidas: ");
    System.out.println("Nome: " +nome);
    System.out.println("Idade: " +idade);
    System.out.println("Salário: " +salario);
    System.out.println("Sexo: " +sexo);
    System.out.println("Estado civil: " +estadoCivil);

    scanner.close();
      
    

  }


  }
  

