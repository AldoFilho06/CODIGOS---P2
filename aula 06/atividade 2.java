import java.util.Scanner; 

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro nome: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite o segundo nome: ");
        String nome2 = sc.nextLine();

        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("os nomes sao iguais");
        }   else {
        System.out.println("os nomes são diferentes");
        }
    sc.close();

    }
}
