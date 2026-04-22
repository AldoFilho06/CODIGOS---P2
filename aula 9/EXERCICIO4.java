public class EXERCICIO4 {
    public static int[] EXERCICIO4 (int[] array){
        int par = 0;
        int impar = 0;
        int[] resultado = {0,0};
        
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                par++;

            }else {
                impar++;
            }
        }
        resultado[0] = par;
        resultado[1] = impar;
        return resultado;

    }
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        int[] resultado = EXERCICIO4(numeros);

        System.out.println("pares: " + resultado[0]);
        System.out.println("impares: " + resultado[1]);
    }

}
