import java.util.Scanner;

public class AulaPLP {
    public static void main(String[] args) {
        int x, y, soma;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        x = s.nextInt();
        System.out.println("Digite o segundo número: ");
        y = s.nextInt();
        soma = x+y;
        if (soma>10){
            System.out.printf("\nA soma dos dois números é maior que 10.\nA soma entre eles é %d", (soma));
        }else{
            System.out.printf("\nA soma é menor ou igual a 10.\nA soma entre eles é %d", (soma));
        }
    }
}
