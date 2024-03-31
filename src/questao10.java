import java.util.Scanner;

public class questao10 {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int soma;

        System.out.println("Insira o primeiro numero: ");
        int num1 = teclado.nextInt();

        System.out.println("Insira o segundo numero: ");
        int num2 = teclado.nextInt();

        soma = num1 + num2;

        if(soma > 10){
            System.out.println("A soma de " +num1+ " e " +num2+ " é " +soma+ ".");
        }
    }
}
