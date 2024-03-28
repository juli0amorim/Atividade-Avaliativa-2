import java.util.Scanner;

public class UsuarioSenha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario, senha;
        boolean senhaIgualUser;

        do {
            System.out.println("Digite o nome de usuário: ");
            nomeUsuario = scanner.nextLine();

            System.out.println("Digite sua senha: ");
            senha = scanner.nextLine();

            senhaIgualUser = senha.equals(nomeUsuario);

            if (senhaIgualUser) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário!");
            }
        } while(senhaIgualUser);
            
        System.out.println("Usuário registrado com sucesso!");

        scanner.close();
    }
}