import java.util.Scanner;

public class questao03 {
    public static void main(String agrs[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = teclado.nextInt();

        if (idade >= 18){
            System.out.println("Pode tirar a carteira de motorista.");
        } else {
            System.out.println("Não pode tirar a carteira de motorista ainda.");
        }
    }
}
