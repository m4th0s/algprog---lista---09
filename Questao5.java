
import java.util.Scanner;

public class Questao5 {

    public static double somaImposto(double taxaImposto, double custo) {

        double valorFinal;

        valorFinal = custo + (custo * taxaImposto / 100);

        return valorFinal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double taxaImposto, custo, resultado;

        System.out.println("Digite o custo do produto:");
        custo = sc.nextDouble();

        System.out.println("Digite a taxa de imposto (%):");
        taxaImposto = sc.nextDouble();

        resultado = somaImposto(taxaImposto, custo);

        System.out.println("Valor com imposto: R$ " + resultado);

        sc.close();
    }
}
