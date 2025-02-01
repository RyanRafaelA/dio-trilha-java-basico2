import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Digite o 1ª numero: ");
        num1 = sc.nextInt();
        System.out.print("Digite o 2ª numero: ");
        num2 = sc.nextInt();

        try{
            contar(num1, num2);
        }catch (ParametrosInvalidosException e){
            System.out.println("Exceção: "+e.getMessage());
        }
    }
}
