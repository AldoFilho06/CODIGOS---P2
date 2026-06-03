public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }

    @Override
    public double getSalario() {
        return super.getSalario() + 2000.00;
    }

    @Override
    public String toString() {
        return super.toString() + " (Cargo: Gerente | Salário com Bônus: R$" + getSalario() + ")";
    }
}