import java.util.Scanner;

public class questao05 {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        int num1 = teclado.nextInt();

        System.out.println("Insira o segundo numero: ");
        int num2 = teclado.nextInt();

        if(num1 > num2){
            System.out.println("" +num1+ " é maior que " +num2);
        } else if(num2 > num1) {
            System.out.println("" +num2+ " é maior que " +num1);
        } else {
            System.out.println("Os numeros são iguais");
        }
    }
}
