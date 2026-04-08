import java.util.Scanner; 

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        System.out.println("Quantidade de caracteres: " + palavra.length());
        
    sc.close();

    }
}
