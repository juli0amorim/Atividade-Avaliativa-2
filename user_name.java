import java.util.Scanner;

public class user_name {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome de usuário: ");
    String nomeUsuario = scanner.nextLine();

    String senha;

    do {
      System.out.print("Coloque sua senha: ");
      senha = scanner.nextLine();

      if (senha.equals(nomeUsuario)) {
        System.out.println("Senha não pode ser igual ao nome de usuário. Por favor digite outra senha:");
      }
    } while (senha.equals(nomeUsuario));
    
    System.out.println("Senha definida com sucesso: ");

    scanner.close();
  } 
}
