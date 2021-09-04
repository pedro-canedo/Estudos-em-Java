import java.util.Scanner;

public class App {
    private static String soma;

    public static void main(String[] args, int j) throws Exception {
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            for (int i=0; 1< args.length; i++){
                soma = args[i];
            }
            System.out.println("Digite uma nota: ");
            n = teclado.nextInt();
            s += n; 
            System.out.println("Quer continuar ? [S/N]: ");
            resp = teclado.next();
        } while (resp.equals("S"));
        int m = s/args.length;
        System.out.println("A media do aluno é " + m);
    }
}
