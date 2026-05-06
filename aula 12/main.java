public class main {
    public static void main(String[] args) {
        
        aluno aluno1 = new aluno("ioha", "090", 8.0, 0.0, 10.0);
        aluno aluno2 = new aluno("Lucas", "765", 9.0, 10.0, 4.0);

        aluno1.verificarsituacao();
        aluno2.verificarsituacao();
    }
}
