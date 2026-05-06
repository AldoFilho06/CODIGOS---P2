public class aluno {
        String nome;
        String matricula;
        double nota1;
        double nota2;
        double notatrabalho;

        public aluno (String nome, String matricula, double nota1, double nota2, double notatrabalho){
            this.nome = nome;
            this.matricula = matricula;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.notatrabalho = notatrabalho;

        }
        public double calcularmedia() {
            return(nota1 + nota2 + notatrabalho)/ 3;

        }
        public void verificarsituacao(){
            double media = calcularmedia();

            if (media >= 7){
                System.out.println("Aluno Aprovado!");

            }else{
                System.out.println("Aluno reprovado!");
            }
        }
     }


