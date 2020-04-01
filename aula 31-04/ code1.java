import java.util.Scanner;

public class AulaPLP {
    public static void main(String[] args){
        int num;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = leitura.nextInt();
        
        if (num>0){
            System.out.println("O número é positivo.");       
        }else{
            System.out.println("O número é negativo.");
        }
    }   
}
