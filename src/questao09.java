import java.util.Scanner;

public class questao09 {
    public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            float salaBruto, salaLiquido;

            System.out.println("Insira o valor da hora aula: ");
            float valorHora = teclado.nextFloat();

            System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
            float horasTrab = teclado.nextFloat();

            System.out.println("Informe o percentual de desconto do INSS: ");
            float percInss = teclado.nextFloat();

            salaBruto = valorHora * horasTrab;
            salaLiquido = salaBruto - (salaBruto * (percInss / 100));

            System.out.println("Salario bruto: R$" +salaBruto+ "\nSalario liquido: R$" +salaLiquido);
    }
}
