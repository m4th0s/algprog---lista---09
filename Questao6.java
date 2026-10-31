
import java.util.Scanner;

public class Questao6 {

    public static int converterHora(int hora) {

        if (hora == 0) {
            return 12;
        }

        if (hora > 12) {
            return hora - 12;
        }

        return hora;
    }

    public static char definirPeriodo(int hora) {

        if (hora >= 12) {
            return 'P';
        } else {
            return 'A';
        }
    }

    public static void mostrarHora(int hora, int minuto, char periodo) {

        System.out.println("Horario convertido: " + hora + ":" + String.format("%02d", minuto) + " " + periodo + ".M.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora, minuto, horaConvertida;
        char periodo, continuar;

        do {

            System.out.println("Digite a hora (0 a 23):");
            hora = sc.nextInt();

            System.out.println("Digite os minutos (0 a 59):");
            minuto = sc.nextInt();

            if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59) {

                horaConvertida = converterHora(hora);

                periodo = definirPeriodo(hora);

                mostrarHora(horaConvertida, minuto, periodo);

            } else {

                System.out.println("Horario invalido!");
            }

            System.out.println("Deseja continuar? (S/N)");
            continuar = sc.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        sc.close();
    }
}
