import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int computador,jogador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("----JoKenPô----");
        System.out.println("[1] Pedra");
        System.out.println("[2] Papel");
        System.out.println("[3] Tesoura");
        System.out.println("------------------------------");
        System.out.print("Digite uma opção desejada: ");
        //Lógica do jogador
        jogador = teclado.nextInt();
        System.out.println("------------------------------");
        switch(jogador){
            case 1:
                System.out.println("Jogador escolheu Pedra");
                break;
            case 2:
                System.out.println("Jogador escolheu Tesoura");
                break;
            case 3:
                System.out.println("Jogador escolheu Tesoura");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        //Lógica do computador
        computador = (int)(Math.random()*3 +1);
        teclado.close();
        switch(computador){
            case 1:
                System.out.println("computador escolheu Pedra");
                break;
            case 2:
                System.out.println("computador escolheu Tesoura");
                break;
            case 3:
                System.out.println("computador escolheu Tesoura");
                break;
        }
        //Lógica que vai determinar o vencedor
        System.out.println("");
        if (jogador == computador){
            System.out.println("Empate");
        } else {
            if ((jogador  == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)){
                System.out.println("O jogador Venceu!!!");
            } else {
                System.out.println("O Computador Venceu!!!");
            }
        }
    }
}
