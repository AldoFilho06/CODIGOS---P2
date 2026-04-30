public class EXERCICIO1 {

    static class Produto {
        String nome;
        double preco;
        int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public void exibirInfo() {
            System.out.println("Produto: " + nome);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Quantidade em estoque: " + quantidade);
            System.out.println("---------------------------");
        }

        public double calcularValorTotalEmEstoque() {
            return preco * quantidade;
        }

        public void adicionarEstoque(int quantidade) {
            this.quantidade += quantidade;
        }
    }

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Mouse", 50.00, 100);

        p1.exibirInfo();
        p2.exibirInfo();

        double valorTotal = p1.calcularValorTotalEmEstoque();
        System.out.println("Valor total em estoque do produto " + p1.nome + ": R$ " + valorTotal);

        p1.adicionarEstoque(5);

        System.out.println("\nApós adicionar mais unidades:");
        p1.exibirInfo();
    }
}
