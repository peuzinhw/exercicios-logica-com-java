import java.util.Scanner;

public class AppTabuada {

    public static void main(String[] args) {

        System.out.println("Digite o numero para gerar a tabuada");
        Scanner in = new Scanner(System.in);

        int x;
        x = in.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));

        }

    }

}
