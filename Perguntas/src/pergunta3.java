import java.util.Scanner;

public class pergunta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double elemento[] = new double[5];
        double somaElement = 0;

        for (int i = 0 ; i < elemento.length ; i++){

            System.out.println("Insira o " + (i + 1) + " elemento:");
            elemento[i] = sc.nextDouble();
            somaElement += elemento[i];


        }
        double mediaElement = somaElement / elemento.length;
        int contadorAcimaMedia = 0 , contadorPositivo = 0 , contadorNegativo = 0;

        for (int i = 0 ; i < elemento.length ; i++){
            if (elemento[i] < 0){
                contadorNegativo++;
            }
            else{
                contadorPositivo++;
            }

            if (elemento[i] >= mediaElement){
                contadorAcimaMedia++;
            }
        }

        int percentualAcimaMedia = (contadorAcimaMedia * 100) / elemento.length;

        System.out.println("Soma dos elementos: " + somaElement);
        System.out.println("Media dos elementos: " + mediaElement);
        System.out.println("Elementos maiores ou iguais a média: " + contadorAcimaMedia);
        System.out.println("Percentual de elementos maiores ou iguais a media: " + percentualAcimaMedia + "%");
        System.out.println("Elementos positivos: " + contadorPositivo);
        System.out.println("Elementos negativos: " + contadorNegativo);
    }
}
