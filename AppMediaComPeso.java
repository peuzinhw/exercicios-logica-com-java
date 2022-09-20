package exercicio2;

import java.util.Scanner;

public class AppMediaComPeso {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double nota1, nota2, media, peso1, peso2;

        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        peso1 = 3.5;
        peso2 = 7.5;
        media = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);

        System.out.println(media);

    }

}
