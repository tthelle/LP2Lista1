import java.util.Scanner;

public class questao06 {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        float media, divisor = 3;

        System.out.println("Insira a nota da primeira prova: ");
        float prova1 = teclado.nextFloat();

        System.out.println("Insira a nota da segunda prova: ");
        float prova2 = teclado.nextFloat();

        System.out.println("Insira a nota do trabalho: ");
        float trab = teclado.nextFloat();

        media = (prova1 + prova2 + trab) / divisor;

        if(media >= 7){
            System.out.println("Media final: " +media+ "\nAprovado!");
        } else {
            System.out.println("Media final: " +media+ "\nReprovado!");
        }
    }
}
