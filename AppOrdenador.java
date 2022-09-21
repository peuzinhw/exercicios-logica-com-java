package exercicio3;

import java.util.Scanner;

public class AppOrdenador {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i, j, k, numeros[];

        numeros = new int[3];

        numeros[0] = in.nextInt();
        numeros[1] = in.nextInt();
        numeros[2] = in.nextInt();

        for (i = 0; i < numeros.length; i++) {
            for (j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    k = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = k;
                }

            }

        }
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
    }

}