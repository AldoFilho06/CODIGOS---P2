import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite uma frase: ");
        String frase = sc.nextLine();

        System.out.print("digite uma palavra: ");
        String palavra = sc.nextLine();

        int posicao = frase.indexOf(palavra);

        if (posicao != -1) {
            System.out.println("A palavra existe na frase");
    } else {
        System.out.println("A palavra não existe na frase");
    }
    sc.close();
}
    
}
