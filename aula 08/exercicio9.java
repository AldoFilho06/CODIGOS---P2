import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senhaCorreta = "1234";
        String tentativa = "";

        while (!tentativa.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            tentativa = leitor.next();

            if (!tentativa.equals(senhaCorreta)) {
                System.out.println("Senha incorreta!");
            }
        }

        System.out.println("Acesso permitido");
        leitor.close();
    }
}