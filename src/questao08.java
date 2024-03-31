import java.util.Scanner;

public class questao08 {
    public static final Integer POW = 2;
    public static Double getSquare(Double number) {
        return Math.pow(number, POW);
    }
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        double area, pi;
        pi = 3.14F;

        System.out.println("Insira o raio da circunferencia: ");
        double raio = teclado.nextDouble();

        area = getSquare(raio)* pi;

        System.out.println("Area da circunferencia: " +area);
    }
}
