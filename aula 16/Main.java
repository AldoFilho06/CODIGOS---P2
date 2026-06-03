import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n--- MENU DE OPERAÇÕES ---");
            System.out.println("1. Adicionar gerente");
            System.out.println("2. Adicionar atendente");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("4. Mostrar salário de funcionário (por CPF)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Gerente: ");
                    String nomeG = input.nextLine();
                    System.out.print("CPF: ");
                    String cpfG = input.nextLine();
                    System.out.print("Salário Base: ");
                    double salarioG = input.nextDouble();
                    input.nextLine();
                    System.out.print("Data de Nascimento: ");
                    String dataG = input.nextLine();

                    listaFuncionarios.add(new Gerente(nomeG, cpfG, salarioG, dataG));
                    System.out.println("Gerente adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do Atendente: ");
                    String nomeA = input.nextLine();
                    System.out.print("CPF: ");
                    String cpfA = input.nextLine();
                    System.out.print("Salário: ");
                    double salarioA = input.nextDouble();
                    System.out.print("Comissão: ");
                    double comissao = input.nextDouble();
                    input.nextLine();
                    System.out.print("Data de Nascimento: ");
                    String dataA = input.nextLine();

                    listaFuncionarios.add(new Atendente(nomeA, cpfA, salarioA, dataA, comissao));
                    System.out.println("Atendente adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- LISTA DE FUNCIONÁRIOS ---");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario f : listaFuncionarios) {
                            System.out.println(f);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Informe o CPF do funcionário: ");
                    String cpfBusca = input.nextLine();
                    boolean encontrado = false;

                    for (Funcionario f : listaFuncionarios) {
                        if (f.getCpf().equalsIgnoreCase(cpfBusca)) {
                            System.out.println("Funcionário: " + f.getNome());
                            System.out.println("Salário Calculado: R$" + f.getSalario());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Funcionário com o CPF informado não foi encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        input.close();
    }
}