import java.util.Scanner;

public class AulaPLP{
    public static void main(String[] args){
        int num1,num2;
        int maior;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = leitura.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leitura.nextInt();
        /*
        if (num1 > num2){
            maior = num1;
        }else {
            maior = num2;
        }*/
        maior = (num1 > num2) ? num1 : num2;
        System.out.println("O maior número é: " + maior);
    }   
}
