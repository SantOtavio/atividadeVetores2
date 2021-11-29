import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class pergunta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String nomesAlunos[] = new String[5];
       double notaAlunos[] = new double[5];
       int contadorPar = 0 , contadorInpar = 0 , contadorAcimaMedia = 0, contadorAbaixoMedia = 0;
       double somanotas = 0;

       for (int i = 0 ; i < notaAlunos.length && i < nomesAlunos.length ; i++){
           System.out.println("Insira o nome do " + (i+1) + " aluno:");
           nomesAlunos[i] = sc.next();
           System.out.println("Insira a nota do " + (i+1) + " aluno:");
           notaAlunos[i] = sc.nextDouble();

           if (notaAlunos[i] % 2 == 0){
               contadorPar++;
           }
           else{
               contadorInpar++;
           }
           somanotas += notaAlunos[i];

       }

       double medianotas = somanotas / notaAlunos.length;
       double maior = 0, menor = 0;

        System.out.println("O vetor possui " + notaAlunos.length + " elementos.");
       for (int i = 0 ; i < notaAlunos.length && i < nomesAlunos.length ; i++){
           System.out.println(nomesAlunos[i] + ":" + " " + notaAlunos[i]);
           if (notaAlunos[i] % 2 == 0){
               System.out.println("A nota é par.");
           }
           else{
               System.out.println("A nota é impar.");
           }
           if (notaAlunos[i] < medianotas){
               contadorAbaixoMedia++;
           }
           else{
               contadorAcimaMedia++;
           }

           maior = notaAlunos[0];

           if (notaAlunos[i] > maior){
               maior = notaAlunos[i];
           }
           if (notaAlunos[i] < maior){
               menor = notaAlunos[i];
           }
       }
        System.out.println("Média das notas: " + medianotas);
        System.out.println("Menor nota: " + menor);
        System.out.println("Maior nota: " + maior);
        System.out.println("Quantia de notas pares: " + contadorPar);
        System.out.println("Quantia de notas impares: " + contadorInpar);
        System.out.println("Quantia de alunos com nota acima da média: " + contadorAcimaMedia);
        System.out.println("Quantia de alunos com nota abaixo da média: " + contadorAbaixoMedia);
    }
}
