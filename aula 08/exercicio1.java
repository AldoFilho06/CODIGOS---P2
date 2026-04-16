import java.util.Scanner;

public class exercicio1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Não tem idade para votar.");
        } else if (idade >= 18 && idade <= 70){
            System.out.println("Você é obrigado a votar.");
        } else {
            System.out.println("Voto facultativo.");
        }
        sc.close();
        
    }
}
