import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String entrada = "";
        String[] sintomasgerais = {"febre","dor de cabeça", "tosse", "dor de garganta",
                "suor noturno", "catarro esverdeado",
                "falta de ar", "perda de oflato/paladar",
                "dor atrás dos olhos", "dor articular"};
        int[] sintomasreais = new int[sintomasgerais.length];
        System.out.println("_________________Suporte Diagnóstico_________________");
        System.out.println("");
        System.out.println("Responda sim ou não (S/N) para os ao sintomas seguir!");
        System.out.println("");
        for (int i = 0; i < sintomasgerais.length; i++) {
            do {
                System.out.println("Você teve " + sintomasgerais[i] + "? (S/N)");
                entrada = teclado.nextLine();
                entrada = entrada.toUpperCase();
                if (entrada.equals("S")) {
                    sintomasreais[i] = 1;
                } else if (entrada.equals("N")) {
                    sintomasreais[i] = 0;
                }
            } while (!entrada.equals("S") && !entrada.equals("N"));
        }
        int espPneumo = sintomasreais[4] + sintomasreais[5];
        int espCovid = sintomasreais[6] + sintomasreais[7];
        int espDengue = sintomasreais[8] + sintomasreais[9];
        if (espDengue >= 1) {
            if (espCovid == 0 && espPneumo == 0) {
                System.out.println("Provavelmente você está com dengue!");
            }
        }
        if (espCovid >= 1) {
            if (espDengue == 0 && espPneumo == 0) {
                System.out.println("Provavelmente você está com COVID19!");
            }
        }
        if (espPneumo >= 1) {
            if (espDengue == 0 && espCovid == 0) {
                System.out.println("Provavelmente você está com Pneumonia!");
            }
        }
        if ((espCovid != 0 && espDengue != 0) || (espCovid != 0 && espPneumo != 0) ||
                (espDengue != 0 && espPneumo != 0)) {
            System.out.println("Diagnóstico inconclusivo!");
        }
        if (espPneumo == 0) {
            if (espDengue == 0 && espCovid == 0) {
                System.out.println("Diagnóstico inconclusivo!");
            }
        }
    }
}