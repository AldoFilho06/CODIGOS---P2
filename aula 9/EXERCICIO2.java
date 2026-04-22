public class EXERCICIO2 {
    public static int EXERCICIO2 (int[] array){
        int maior = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
            }
        }
        return maior;
    }
    public static void main (String[] args){
        int[] numeros = {5, 2, 9, 1 ,7};
        int resultado = EXERCICIO2(numeros);
        System.out.println("Maior valor: " + resultado);
    }
}
