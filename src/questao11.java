import java.util.Scanner;

public class questao11 {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int soma;

        System.out.println("Insira o primeiro numero: ");
        int num1 = teclado.nextInt();

        System.out.println("Insira o segundo numero: ");
        int num2 = teclado.nextInt();

        soma = num1 + num2;

        if(soma >= 10){
            soma += 5;
            System.out.println("A soma de " +num1+ " e " +num2+ " adicionado 5 é " +soma+ ".");
        } else {
            soma -= 7;
            System.out.println("A soma de " +num1+ " e " +num2+ " subtraido 7 é " +soma+ ".");
        }
    }
}
