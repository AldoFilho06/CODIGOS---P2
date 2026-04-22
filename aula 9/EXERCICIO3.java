public class EXERCICIO3 {
    public static boolean EXERCICIO3 (String [] array, String busca) {
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(busca)){
             return true;
        }
    }
    return false;
}
public static void main(String[] args){
    String[] nomes = {"ana", "joao", "maria"};
    boolean resultado = EXERCICIO3(nomes, "joao");
    System.out.println("elemento existe? " + resultado);
}
}