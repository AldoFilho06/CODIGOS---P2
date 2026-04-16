import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Digite sua idade para ver sua clasificação: ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 7){
            System.out.println("Sua classificação: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Sua classificação: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Sua Classificação: Juvenil A");
        }else if (idade >= 14 && idade <= 17) {
            System.out.println("Sua classificação: Juvenil B");
        }else if (idade >= 18) {
            System.out.println("Sua classificação: Adulto");
        } else {
            System.out.print("Você não tem idade suficiente.");
        }
        sc.close();
    }    
}
