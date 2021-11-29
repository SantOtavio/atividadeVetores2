import java.util.Scanner;

public class pergunta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double notaAlunos[] = new double[5];
        double somaNotas = 0 , mediaNotas;
        int alunosAcimaMedia = 0;

        for (int i = 0 ; i < notaAlunos.length ; i++){
            System.out.println("Insira a nota do aluno: ");
            notaAlunos[i] = sc.nextDouble();
            somaNotas += notaAlunos[i];
        }
        mediaNotas = somaNotas / notaAlunos.length;
        for (int i = 0 ; i < notaAlunos.length ; i++){
            if (notaAlunos[i] >= mediaNotas){
                alunosAcimaMedia++;
            }
        }
        System.out.println("Média das notas: " + mediaNotas);
        System.out.println("Número de alunos abaixo da média: " + alunosAcimaMedia);
    }
}
