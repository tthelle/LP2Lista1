import java.util.Scanner;

public class questao07 {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        float imc;

        System.out.println("Insira peso atual: ");
        float peso = teclado.nextFloat();

        System.out.println("Insira altura: ");
        float altura = teclado.nextFloat();

        imc = peso / (altura * 2);

        if (imc > 30) {
            System.out.println("IMC = " +imc+ " indica obesidade.");
        } else {
            System.out.println("IMC = " +imc+ " nao indica obesidade.");
        }
    }
}
