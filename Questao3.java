
import java.util.Scanner;

public class Questao3 {

    public static int somar(int a, int b, int c) {

        int resultado;

        resultado = a + b + c;

        return resultado;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, resultado;

        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro numero:");
        num3 = sc.nextInt();

        resultado = somar(num1, num2, num3);

        System.out.println("A soma e: " + resultado);

        sc.close();
    }
}
