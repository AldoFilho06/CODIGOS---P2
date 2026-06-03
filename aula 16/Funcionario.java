public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String dataNascimento;

    public Funcionario(String nome, String cpf, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf + " | Salário Base: R$" + salario + " | Nasc: " + dataNascimento;
    }
}