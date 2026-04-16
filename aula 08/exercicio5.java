public class exercicio5 {
    public static void main(String[] args) {

        int[] notas = {7, 8, 6, 10, 9};
        double soma = 0;

        for (int nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        int acimaMedia = 0;
        for (int nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }

        System.out.println("Média: " + media);
        System.out.println("Notas acima da média: " + acimaMedia);
    }
}