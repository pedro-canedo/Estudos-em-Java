package jogodavelha;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Jv Jogo = new Jv();
        String posicao;
        int valida  = 0, jogadas = 0;
        
        while(true){//****************************
            System.out.println("::::Jogo da Velha::::");
            Jogo.Mostrar();
            
            do{//inicia jogador 1
                System.out.println("Jogador 1, informe uma posição entre 1 e 9: ");
                posicao = ler.next();
                while(!Jogo.Valido(posicao)){
                    System.out.println("Jogada Invalida, Tente novamente");
                    System.out.println("Jogador 1, informe uma posição entre 1 e 9: ");
                    posicao = ler.next();
                    valida = 0;
                }
                Jogo.Jogada(posicao, "x");
                valida = 1;
            
            }while(valida==0);//fim jogador 1
            
            jogadas++;
            valida = 0;
            if(!Jogo.Ganhou(jogadas).equals("null")){
                break;
            }
            
            do{//inicia jogador 2
                System.out.println("Jogador 2, informe uma posição entre 1 e 9: ");
                posicao = ler.next();
                while(!Jogo.Valido(posicao)){
                    System.out.println("Jogada Invalida, Tente novamente");
                    System.out.println("Jogador 2, informe uma posição entre 1 e 9: ");
                    posicao = ler.next();
                    valida = 0;
                }
                Jogo.Jogada(posicao, "o");
                valida = 1;
            
            }while(valida==0);//fim jogador 2
            
            jogadas++;
            valida = 0;
            if(!Jogo.Ganhou(jogadas).equals("null")){
                break;
            }
            
        }//***************************************
        
        System.out.println("O "+Jogo.Ganhou(jogadas)+"Venceu");
        
    }
    
}
