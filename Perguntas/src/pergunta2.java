import java.util.Scanner;

public class pergunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[10];
        int maior=0 , menor = 0;
        for (int i = 0 ; i < num.length ; i++){
            System.out.println("Insira o número " + (i + 1));
            num[i] = sc.nextInt();

            maior = num[0];

            if (num[i] > maior){
                maior = num[i];
            }
            if (num[i] < maior){
                menor = num[i];
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
