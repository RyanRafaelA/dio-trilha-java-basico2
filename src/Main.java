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

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1>parametro2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contador = parametro2-parametro1;

        for(int x=1; x<=contador; x++){
            System.out.println("Imprimindo o número "+x);
        }
    }
}
