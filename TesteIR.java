import java.util.Scanner;

public class TesteIR {
    public static void main(String[] args) {

        System.out.println("Digite o valor do seu salário com . ao invés de vírgula:");

        Scanner in = new Scanner(System.in);

        double salario = in.nextDouble();
        double IR = 0.0;
        double aliquota = 0;

        if (salario < 1212) {
            System.out.println("Seu salário está abaixo do piso do salário mínimo!");
            System.out.println("Coloque seu patrão na justiça!!");
        } else if (salario <= 1903.98) {
            System.out.println("Seu salario é isento do imposto de renda!");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            aliquota = (0.075);
            IR = (salario * aliquota) - 142.80;
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            aliquota = (0.15);
            IR = (salario * aliquota) - 354.8;
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            aliquota = (0.225);
            IR = (salario * aliquota) - 636.13;
        } else if (salario > 4664.68) {
            aliquota = (0.275);
            IR = (salario * aliquota) - 869.36;
        }

        System.out.println("a alíquota de IR para a sua faixa salarial é de " + aliquota);
        System.out.println("o valor de Imposto de Renda a ser retido, com o desconto aplicado, equivale a: " + IR);
    }

}
