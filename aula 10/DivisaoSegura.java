import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        while (!sucesso) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int num1 = scanner.nextInt();

                System.out.print("Digite o segundo número inteiro: ");
                int num2 = scanner.nextInt();

                int resultado = num1 / num2; 
                
                System.out.println("Resultado da divisão: " + resultado);
                sucesso = true; 
                
            } catch (InputMismatchException e) {
                System.out.println("Erro: Você deve digitar apenas números inteiros. Tente novamente.\n");
                scanner.nextLine(); 
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir um número por zero. Tente novamente.\n");
            }
        }

        scanner.close();
    }
}