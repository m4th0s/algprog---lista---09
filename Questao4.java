
import java.util.Scanner;

public class Questao4 {

    public static char verificar(int numero) {

        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        char resultado;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        resultado = verificar(numero);

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
