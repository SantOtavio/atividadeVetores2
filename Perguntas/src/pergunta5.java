import java.util.Scanner;

public class pergunta5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor[] = new int[6] , qtdPares = 0;
        String numerospares = "Números pares estão nas posições:";

        for (int i = 0 ; i < valor.length ; i++){
            System.out.println("Insira um valor: ");
            valor[i] = sc.nextInt();
            if (valor[i] % 2 == 0 ){
                numerospares += "\n" + i;
                qtdPares++;
            }
        }
        System.out.println(numerospares);
        System.out.println("Quantidade de números pares: " + qtdPares);
    }
}
