import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int salario;

        System.out.println("Insira a quantidade de horas trabalhadas: ");
        int horas = teclado.nextInt();

        salario = horas * 20;

        System.out.println("Salario total: R$" +salario );

    }
}