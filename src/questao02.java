import java.util.Scanner;

public class questao02 {
    public static void main(String[] args){
        
            Scanner teclado = new Scanner(System.in);

            float divisor, custo, quantGaso;
            divisor = 12;
            
            System.out.println("Informe a distância que será percorrida: ");
            float distancia = teclado.nextFloat();

            System.out.println("Informe o preco do litro da gasolina: ");
            float precoLitro = teclado.nextFloat();

            quantGaso = distancia / divisor;

            custo = quantGaso * precoLitro;

            System.out.println("Quantidade de gasolina utilizada: " +quantGaso+ "\nCusto final: R$" +custo );
    }
}
