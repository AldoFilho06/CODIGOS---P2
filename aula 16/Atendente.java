public class Atendente extends Funcionario {
    private double comissao;

    public Atendente(String nome, String cpf, double salario, String dataNascimento, double comissao) {
        super(nome, cpf, salario, dataNascimento);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public String toString() {
        return super.toString() + " (Cargo: Atendente | Comissão: R$" + comissao + ")";
    }
}